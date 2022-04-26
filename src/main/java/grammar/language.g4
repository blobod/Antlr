grammar language;
language
    :  (stmts | expression)* EOF
    | declaration* entrypoint;
entrypoint
    : (AT_SIGN START (stmts | expression | type_definition)+ AT_SIGN STOP);

declaration
    : type_definition
    | function_declaration;

//TYPES
type_definition
    : TYPE ID ASSIGN (ID | INT | DOUBLE | TXT | BOOL);

//TYPES

//Function declaration
function_declaration
    : (TYPE | VOID) ID LPAR param+ RPAR LCBRAC (stmt | ID | expression | type_definition)* RCBRAC;
param
    : TYPE ID
    | (COMMA)* TYPE ID;

//Function Declaration

stmts
    : stmt;

stmt
    : conditional_statement
    | iterative_statement;

expression
    : (ID | INT | DOUBLE) PLUS (ID | INT | DOUBLE) # Addition
    | (ID | INT | DOUBLE) MINUS (ID | INT | DOUBLE) # Substraktion
    | (ID | INT | DOUBLE) MULTIPLICATION (ID | INT | DOUBLE) # Multiplication
    | (ID | INT | DOUBLE) DIVISION (ID | INT | DOUBLE) # Division
    | (ID | INT | DOUBLE) POWER_OF (ID | INT | DOUBLE) # Power_of
    | ((PLUS | MINUS | MULTIPLICATION | DIVISION)+ LPAR expression+ RPAR) # Paranthesis
    | (PLUS | MINUS | MULTIPLICATION | DIVISION)+ (ID | INT | DOUBLE) #Bigger_expression
    | ID # Variable
    | (INT | DOUBLE) # Number;

//CONDITINAL STATEMENT
conditional_statement
    : if_statement;
if_statement
    : IF LPAR condition RPAR LCBRAC (stmt | expression)+ RCBRAC (ELSE LCBRAC stmt RCBRAC)?;
//CONDITINAL STATEMENT

// ITERATIVE STATEMENT
iterative_statement
    : for_loop
    | while_loop
    | forever_loop;
for_loop
    : FOR LPAR TYPE COMMA (condition) COMMA expression LCBRAC (stmt | expression)+ RCBRAC;
while_loop
    : WHILE LPAR (condition) RPAR LCBRAC (stmt | expression)+ RCBRAC;
forever_loop
    : FOREVER LCBRAC (stmt | expression)+ RCBRAC;
// ITERATIVE STATEMENT

//CONDITIONS
condition
    : boolean_expression (OR boolean_expression)*;

boolean_expression
    : (ID | INT | DOUBLE) GREATHER (ID | INT | DOUBLE)
    | (ID | INT | DOUBLE) LESSER (ID | INT | DOUBLE)
    | (ID | INT | DOUBLE) EQUAL (ID | INT | DOUBLE)
    | (ID | INT | DOUBLE) GREATHEROREQUAL (ID | INT | DOUBLE)
    | (ID | INT | DOUBLE) LESSEROREQUAL (ID | INT | DOUBLE)
    | (ID | INT | DOUBLE) ISNOTEQUAL (ID | INT | DOUBLE);

GREATHER
    : '>'
    | 'Greather';
LESSER
    : '<'
    | 'Lesser';
EQUAL
    : '=='
    | 'Equal';
GREATHEROREQUAL
    : '>='
    | 'Greather_or_equal';
LESSEROREQUAL
    : '<='
    | 'Lesser_or_equal';
ISNOTEQUAL
    : '!='
    | 'Is_not_equal';
//CONDITIONS


// TOKENS
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
    : [0-9]+ DOT [0-9]+
    ;
TXT
    : [a-z][A-Z]+;

BOOL
    : TRUE | FALSE;

TRUE
    : '1'
    | 'true';
FALSE
    : '0'
    | 'false';
ID
    :[a-z_]?([A-Za-z0-9_])+;

// Whitespace and comments
WS  :  [ \t\r\n\u000C]+ -> channel(HIDDEN)
    ;

COMMENT
    :   '/*' .*? '*/' -> channel(HIDDEN)
    ;

LINE_COMMENT
    :   '//' ~[\r\n]* -> channel(HIDDEN)
    ;