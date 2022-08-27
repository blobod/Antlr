grammar language;
language
    :  (stmts)* EOF;

stmts
    : stmt+;

stmt
    : conditional_statement
    | iterative_statement
    | declaration
    | print
    | println
    | stop
    | function_call;

stop
    : STOP;

declaration
    : type_declaration
    | function_declaration
    | type_reassign;

print
    : PRINT LPAR ((expression)+ | function_call) RPAR;

println
    : PRINTLN LPAR ((expression)+ | function_call) RPAR;

//TYPES
type_declaration
    : TYPE ID ASSIGN ((expression)+ | BOOL) # Var_dec_with_value
    | TYPE ID # Var_dec_no_value;
type_reassign
    : ID ASSIGN (expression+);
//TYPES

//Function declaration
function_declaration
    : (TYPE) ID LPAR param* RPAR LCBRAC (stmts | ID | type_declaration)* return_func RCBRAC #FuncWithReturn
    | VOID ID LPAR param* RPAR LCBRAC (stmts | ID | type_declaration)* RCBRAC #FuncVoid;
param
    : type_declaration (COMMA type_declaration)*;
//Function Declaration
//Function call
function_call
    : ID LPAR function_call_param* RPAR;

return_func
    : RETURN (expression+);

function_call_param
    : expression (COMMA expression)*;
//Function call
expression
    : expression PLUS expression # Addition
    | expression MINUS expression # Substraktion
    | expression MULTIPLICATION expression # Multiplication
    | expression DIVISION expression # Division
    | expression POWER_OF expression # Power_of
    | expression GREATER expression # GreaterThan
    | expression LESSER expression # LesserThan
    | expression EQUAL expression # EqualWith
    | expression GREATEROREQUAL expression # GreaterorEqualThan
    | expression LESSEROREQUAL expression # LesserorEqualThan
    | expression ISNOTEQUAL expression # IsNotEqualWith
    | ((PLUS | MINUS | MULTIPLICATION | DIVISION)+ LPAR expression+ RPAR) # Paranthesis
    | (PLUS | MINUS | MULTIPLICATION | DIVISION)+ expression #Bigger_expression
    | ID # Variable
    | INT # Integer_NUM
    | DOUBLE # Double_NUM
    | TXT # String
    | BOOL # Bool
    | function_call #Func_Call;

//CONDITINAL STATEMENT
conditional_statement
    : if_statement
    | break_statement;
if_statement
    : IF LPAR expression (OR expression)* RPAR LCBRAC (stmts* | return_func) RCBRAC # If
    | IF LPAR expression  (OR expression)* RPAR LCBRAC (stmts* | return_func) RCBRAC (ELSE LCBRAC (stmts) RCBRAC) # Else;
break_statement
    : BREAK;

//CONDITINAL STATEMENT

// ITERATIVE STATEMENT
iterative_statement
    : for_loop
    | while_loop
    | forever_loop;
for_loop
    : FOR LPAR (type_declaration|type_reassign|ID) COMMA (expression) COMMA type_reassign RPAR LCBRAC (stmts | return_func) RCBRAC;

while_loop
    : WHILE LPAR (expression) RPAR LCBRAC (stmts| return_func) RCBRAC;
forever_loop
    : FOREVER LCBRAC (stmts| return_func) RCBRAC;
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


PRINT
    : 'print';
PRINTLN
    : 'println';
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

RETURN
    : 'return';

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