grammar language;
language
    :  (declaration)* AT_SIGN? START? ID* (stmts) AT_SIGN? STOP? EOF;
declaration
    : type_definition
    | function_declaration;


stmts
    : stmt
    | expression;

stmt
    : conditional_statement
    | iterative_statement;

expression
    : iDorVALUE PLUS iDorVALUE (PLUS iDorVALUE)*
    | iDorVALUE MINUS iDorVALUE (MINUS iDorVALUE)*
    | iDorVALUE MULTIPLIKATION iDorVALUE (MULTIPLIKATION iDorVALUE)*
    | iDorVALUE DIVISION iDorVALUE (DIVISION iDorVALUE)*
    | iDorVALUE POWER_OF iDorVALUE;
//CONDITINAL STATEMENT
conditional_statement
    : if_statement;
if_statement
    : IF LPAR condition RPAR LCBRAC stmt RCBRAC ?(ELSE LCBRAC stmt RCBRAC);
//CONDITINAL STATEMENT

// ITERATIVE STATEMENT
iterative_statement
    : for_loop
    | while_loop
    | forever_loop;
for_loop
    : FOR LPAR type COMMA (condition) COMMA stmt LCBRAC stmt RCBRAC
    | FOR LPAR type COMMA (condition) COMMA expression LCBRAC stmt RCBRAC;
while_loop
    : WHILE LPAR (condition) RPAR LCBRAC stmt RCBRAC|
    | WHILE LPAR (condition) RPAR LCBRAC expression RCBRAC;
forever_loop
    : FOREVER LCBRAC stmt RCBRAC
    | FOREVER LCBRAC expression RCBRAC;
// ITERATIVE STATEMENT

//CONDITIONS
condition
    : idORvalue_condition (OR idORvalue_condition)*;

idORvalue_condition
    : iDorVALUE greather iDorVALUE
    | iDorVALUE lesser iDorVALUE
    | iDorVALUE equal iDorVALUE
    | iDorVALUE greatherORequal iDorVALUE
    | iDorVALUE lesserORequal iDorVALUE
    | iDorVALUE isNOTequal iDorVALUE;
greather
    : '>'
    | 'Greather';
lesser
    : '<'
    | 'Lesser';
equal
    : '=='
    | 'Equal';
greatherORequal
    : '>='
    | 'Greather_or_equal';
lesserORequal
    : '<='
    | 'Lesser_or_equal';
isNOTequal
    : '!='
    | 'Is_not_equal';
//CONDITIONS


//TYPES
type_definition
    : data_type;

data_type
    : type ID ASSIGN iDorVALUE;

//TYPES

//Function declaration
function_declaration
    : type ID LPAR param RPAR LCBRAC stmt ID* expression RCBRAC
    | VOID ID LPAR param RPAR LCBRAC stmt ID* expression RCBRAC;
param
    : (type ID)?
    | (type ID COMMA)+;

//Function Declaration

// TOKENS
IF
    : 'if';
ELSE
    : 'else';
PLUS
    : '+';
MINUS
    : '-';
MULTIPLIKATION
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
type
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
value
    : INT
    | TXT
    | DOUBLE
    | BOOL;
iDorVALUE
    : value
    | ID;


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
    : TRUE+ | FALSE+;

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