grammar AST;
AST
    :  (stmts)* EOF
    |  stmts* entrypoint EOF;

entrypoint
    : (AT_SIGN START (stmts)+ AT_SIGN STOP);

stmts
    : stmt+;

stmt
    : conditional_statement
    | iterative_statement
    | declaration
    | print
    | input;

declaration
    : type_declaration
    | function_declaration
    | type_reassign;

print
    : PRINT LPAR (astNode)+ RPAR;
input
    : INPUT LPAR astNode RPAR;

//TYPES
type_declaration
    : TYPE ID ASSIGN (DOUBLE | INT | TXT | BOOL);
type_reassign
    : ID ASSIGN (astNode | ID | DOUBLE | INT | TXT | BOOL);
//TYPES

//Function declaration
function_declaration
    : (TYPE | VOID) ID LPAR param+ RPAR LCBRAC (stmts | ID | astNode | type_declaration)* RCBRAC;
param
    : TYPE ID
    | (COMMA)* TYPE ID;

//Function Declaration
astNode
    : astNode PLUS astNode # Addition
    | astNode MINUS astNode # Substraktion
    | astNode MULTIPLICATION astNode # Multiplication
    | astNode DIVISION astNode # Division
    | astNode POWER_OF astNode # Power_of
    | astNode GREATER astNode # GreaterThan
    | astNode LESSER astNode # LesserThan
    | astNode EQUAL astNode # EqualWith
    | astNode GREATEROREQUAL astNode # GreaterorEqualThan
    | astNode LESSEROREQUAL astNode # LesserorEqualThan
    | astNode ISNOTEQUAL astNode # IsNotEqualWith
    | ((PLUS | MINUS | MULTIPLICATION | DIVISION)+ LPAR astNode+ RPAR) # Paranthesis
    | (PLUS | MINUS | MULTIPLICATION | DIVISION)+ astNode #Bigger_expression
    | ID # Variable
    | (DOUBLE | INT) # Number
    | TXT # String;

//CONDITINAL STATEMENT
conditional_statement
    : if_statement
    | break_statement;
if_statement
    : IF LPAR astNode (OR astNode)* RPAR LCBRAC (stmts) RCBRAC # If
    | IF LPAR astNode  (OR astNode)* RPAR LCBRAC (stmts) RCBRAC (ELSE LCBRAC (stmts) RCBRAC) # Else;
break_statement
    : BREAK;

//CONDITINAL STATEMENT

// ITERATIVE STATEMENT
iterative_statement
    : for_loop
    | while_loop
    | forever_loop;
for_loop
    : FOR LPAR (stmt) COMMA (astNode) COMMA astNode LCBRAC (stmts) RCBRAC;
while_loop
    : WHILE LPAR (astNode) RPAR LCBRAC (stmts) RCBRAC;
forever_loop
    : FOREVER LCBRAC (stmts) RCBRAC;
// ITERATIVE STATEMENT
GREATER
    : '>';
LESSER
    : '<'
    | 'Lesser';
EQUAL
    : '=='
    | 'Equal';
GREATEROREQUAL
    : '>='
    | 'Greater_or_equal';
LESSEROREQUAL
    : '<='
    | 'Lesser_or_equal';
ISNOTEQUAL
    : '!='
    | 'Is_not_equal';
//CONDITIONS


// TOKENS
INPUT
    : 'input';

PRINT
    : 'print';

BREAK
    : 'break';
IF
    : 'if';
ELSE
    : 'else';
PLUS
    : '+';
MINUS
    : '-';
MULTIPLICATION
    :'*';
DIVISION
    :'/';
POWER_OF
    :'^';
OR
    : '||';
STOP
    : 'stop';
FOR
    : 'for';
WHILE
    : 'while';
FOREVER
    : 'forever';
START
    : 'start';
COMMA
    : ',';
AT_SIGN
    : '@';
VOID
    : 'void';
LPAR
    : '(';
RPAR
    : ')';
LCBRAC
    : '{';
RCBRAC
    : '}';
TYPE
    : INT_TYPE
    | DOUBLE_TYPE
    | TXT_TYPE
    | BOOL_TYPE;

INT_TYPE
    : 'int';
DOUBLE_TYPE
    : 'double';
TXT_TYPE
    : 'txt';
BOOL_TYPE
    : 'bool';
ASSIGN
    : '=';
INT
    : [0-9]+;
DOT
    : '.';
DOUBLE
    : [0-9]+ DOT [0-9]+;

TXT:
    '"' [a-z_]?([A-Za-z0-9_])+ '"' ;

BOOL
    : TRUE | FALSE;

TRUE
    : 'true';
FALSE
    : 'false';
ID
    : [a-z_]?([A-Za-z0-9_])+;

// Whitespace and comments
WS  :  [ \t\r\n\u000C]+ -> channel(HIDDEN)
    ;

COMMENT
    :   '/*' .*? '*/' -> channel(HIDDEN)
    ;

LINE_COMMENT
    :   '//' ~[\r\n]* -> channel(HIDDEN)
    ;