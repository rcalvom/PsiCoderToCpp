grammar PsiCoder;

s : (funcion | estructura)* principal (funcion | estructura)* EOF ;

funcion :  'funcion' tipo ID '(' param_funcion ')' 'hacer' (sentencia)* 'fin_funcion' ;

param_funcion :  (tipo ID (',' tipo ID)* )?;

estructura : 'estructura' ID (atributo)* 'fin_estructura' ;

atributo : tipo dec_variable ';' ;

principal : 'funcion_principal' (sentencia)+ 'fin_principal' ;

sentencia
    : 'si' '(' expresion ')' 'entonces' (sentencia)* ('si_no' (sentencia)*)? 'fin_si'
    | 'seleccionar' '(' expresion ')' 'entre' (caso)+ 'fin_seleccionar'
    | 'para' '(' tipo? id '=' expresion ';' expresion ';' expresion')' 'hacer' (sentencia)* 'fin_para'
    | 'hacer' (sentencia)* 'mientras' '(' expresion ')' ';'
    | 'mientras' '(' expresion ')' 'hacer' (sentencia)* 'fin_mientras'
    | 'leer' '(' id ')' ';'
    | imprimir
    | 'retorno' expresion ';'
    | tipo id ('=' expresion)? (',' id ('=' expresion)?)*  ';'
    | id ('=' expresion)? (',' id ('=' expresion)?)*  ';'
    | 'romper' ';'
    | idcall ';'
    ;

imprimir : 'imprimir' '(' (id | expresion) (',' (id | expresion))* ')' ';' ;

caso
    : 'caso' expresion ':' (sentencia)*
    | 'defecto' ':' (sentencia)* ;

tipo: ID(.ID)*
    | 'entero'
    | 'booleano'
    | 'caracter'
    | 'real'
    | 'cadena'
    ;

dec_variable: ID (asignacion)* (',' dec_variable)* ;

asignacion: '=' expresion ;

expresion: valor (operador)* (expresion)* ;


operador
    : '&&'
    | '||'
    | '=='
    | '!='
    | '<'
    | '>'
    | '<='
    | '>='
    | '+'
    | '-'
    | '*'
    | '%'
    | '/'
    ;

valor
    : '(' expresion ')'
    | '-'
    | '!'
    | 'verdadero'
    | 'falso'
    | idcall
    | numero_palabra
    ;

numero_palabra
    : ENTERO
    | REAL
    | CARACTER
    | CADENA
    ;

idcall : ID (idestructura | call)? ;

call : '(' (ID(.ID)* (',' ID(.ID)*)*)? ')' ;

idestructura: '.' ID ('.' idestructura)* ;

id : ID(.ID)*;

ESPACIADO : [ \t\r\n]+ -> skip;

COMENTARIO_LINEA : '//' ~ [\r\n]* -> skip;

COMENTARIO_BLOQUE : '/*' .*? '*/' -> skip;

ID : [a-zA-Z][a-zA-Z0-9_]*;

ENTERO: [1-9][0-9]* | '0';

REAL: [0-9]+.[0-9]+ ;

CARACTER: '\'' [a-zA-Z0-9_] '\'' ;

CADENA: '"' [a-zA-Z0-9_ ]* '"' ;


