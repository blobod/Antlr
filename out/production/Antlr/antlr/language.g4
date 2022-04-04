grammar language;
start
    : declaration+ EOF
    | definition+ EOF;
declaration
    : stmts;
stmts
    : stmt;
stmt
    : EXPRESSION*;
EXPRESSION
    : '+'
    | '-'
    | '*'
    | '/';

definition
    : TYPE ID '=' VALUE;

TYPE
    : NUM_TYPE
    | TXT_TYPE
    | BOOL_TYPE;
NUM_TYPE
    : 'num';
TXT_TYPE
    : 'txt';
BOOL_TYPE
    : 'bool';

ID
    : [a-z][A-Z]+;

VALUE
    : NUM
    | TXT
    | BOOL;

NUM
    : '0'..'9'+;
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



//
// Whitespace and comments
//

WS  :  [ \t\r\n\u000C]+ -> channel(HIDDEN)
    ;

COMMENT
    :   '/*' .*? '*/' -> channel(HIDDEN)
    ;

LINE_COMMENT
    :   '//' ~[\r\n]* -> channel(HIDDEN)
    ;