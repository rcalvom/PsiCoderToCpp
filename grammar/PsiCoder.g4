grammar PsiCoder;

s : (funcion | estructura)* principal (funcion | estructura)* EOF ;

funcion :  'funcion' tipo ID '(' param_funcion ')' 'hacer' (sentencia)* 'fin_funcion' ;

param_funcion :  (tipo ID (',' tipo ID)* )?;

estructura : 'estructura' ID (sentencia_estructura)* 'fin_estructura' ;

sentencia_estructura : tipo ID (',' ID)* ';' ;

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
    // idcall ';' LLamado a función.
    ;

imprimir : 'imprimir' '(' expresion (',' expresion)* ')' ';' ;

caso
    : 'caso' expresion ':' (sentencia)*
    | 'defecto' ':' (sentencia)* ;

tipo
    : id
    | 'entero'
    | 'booleano'
    | 'caracter'
    | 'real'
    | 'cadena'
    ;

expresion
    : ENTERO
    | REAL
    | BOOLEANO
    | CADENA
    | CARACTER
    | id
    | llamado_funcion
    | '(' expresion ')'
    | expresion operador_binario expresion
    | operador_unitario expresion
    ;

llamado_funcion : id '(' (expresion (',' expresion)*)? ')' ;

operador_binario
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

operador_unitario
    : '-'
    | '!'
    ;

id : ID('.' ID)*;

ESPACIADO : [ \t\r\n]+ -> skip;

COMENTARIO_LINEA : '//' ~ [\r\n]* -> skip;

COMENTARIO_BLOQUE : '/*' .*? '*/' -> skip;

BOOLEANO: 'falso' | 'verdadero';

ID : [a-zA-Z][a-zA-Z0-9_]*;

ENTERO: [1-9][0-9]* | '0';

REAL: [0-9]+'.'[0-9]+ ;

CARACTER: '\'' [a-zA-Z0-9_] '\'' | '\'\\n\'' ;

CADENA: '"' [a-zA-Z0-9_ ]* '"' ;
