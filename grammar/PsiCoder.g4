grammar PsiCoder;

s : (funcion | estructura)* principal (funcion | estructura)* EOF ;

funcion :  'funcion' tipo ID '(' param_funcion ')' 'hacer' (sentencia)+ 'fin_funcion' ;

param_funcion :  (tipo ID (',' tipo ID)* )?;

estructura : 'estructura' ID (atributos)* 'fin_estructura' ;

atributos : tipo dec_variable ';' ;

principal : 'funcion_principal' (sentencia)+ 'fin_principal' ;

sentencia
    : 'si' '(' expresion ')' 'entonces' (sentencia)* ('si_no' (sentencia)*)? 'fin_si'
    | 'seleccionar' '(' expresion ')' 'entre' casos 'fin_seleccionar'
    //|'para' '('
    | 'hacer' (sentencia)* 'mientras' '(' expresion ')' ';'
    | 'mientras' '(' expresion ')' 'hacer' (sentencia)* 'fin_mientras'
    | 'leer' '(' ID ')' ';'
    | 'imprimir' '(' (ID | expresion) (',' (ID | expresion))* ')' ';'
    | 'retorno' expresion ';'
    | 'romper' ';'
    ;

casos
    : 'caso' ENTERO ':' sentencia 'romper' ';' casos
    | 'defecto' ':' sentencia
    ;

tipo: ID
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

call : '(' param_funcion ')' ;

idestructura: '.' ID ('.' idestructura)* ;

ESP : [ \t\r\n]+ -> skip;

ID : [a-zA-Z]+[a-zA-Z0-9_]*;

ENTERO: [1-9][0-9]* ;

REAL: [0-9]+.[0-9]+ ;

CARACTER: '\'' [a-zA-Z0-9_] '\'' ;

CADENA: '"' [a-zA-Z0-9_ ]+ '"' ;

/*EXPRESION -> VALOR OPERADOR
OPERADOR -> tk_y EXPRESION
OPERADOR -> tk_o EXPRESION
OPERADOR -> tk_igual EXPRESION
OPERADOR -> tk_dif EXPRESION
OPERADOR -> tk_menor EXPRESION
OPERADOR -> tk_mayor EXPRESION
OPERADOR -> tk_menor_igual EXPRESION
OPERADOR -> tk_mayor_igual EXPRESION
OPERADOR -> tk_mas EXPRESION
OPERADOR -> tk_menos EXPRESION
OPERADOR -> tk_mult EXPRESION
OPERADOR -> tk_mod EXPRESION
OPERADOR -> tk_div EXPRESION
OPERADOR -> epsilon
VALOR -> tk_par_izq EXPRESION tk_par_der
VALOR -> IDCALL
VALOR -> NUMERO_PALABRA
VALOR -> BOOLEANO
VALOR -> tk_menos VALOR
VALOR -> tk_neg VALOR
NUMERO_PALABRA -> tk_entero
NUMERO_PALABRA -> tk_real
NUMERO_PALABRA -> tk_caracter
NUMERO_PALABRA -> tk_cadena
BOOLEANO -> verdadero
BOOLEANO -> falso
IDCALL -> id IDCALL2
IDCALL2 -> IDESTRUC
IDCALL2 -> CALL
IDCALL2 -> epsilon*/


