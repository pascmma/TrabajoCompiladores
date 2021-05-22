grammar mini0lexer;



/*lexicas*/

TRUE  		: 'true';

FALSE 		: 'false';

RESERVEDWORDS 	:  'if' | 'else' | 'end' | 'while' | 'loop' | 'fun' |
                       'return' | 'new' | 'string' | 'int' | 'char' |
                       'bool' | TRUE | FALSE | 'and' | 'or' | 'not';

NUMERICLITERAL 	:  ( ('+'|'-')?('0'..'9') | (('0x') ('0'..'9'|'a'..'f'|'A'..'F')+) )+;

IDENTIFIER      : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;

STRINGLITERAL 	: '"' ( ('\\'|'\n'|'\r'|'\t') | ~('\'') )* '"';

COMMENTBLOCK	: '/*' .*? '*/' WHITESPACE -> skip;

COMMENTLINE	: '//' ~('\n'|'\r')* '\r'? '\n' -> skip;

NEWLINE      	: ('\n')+;

WHITESPACE      : ( ' ' |'\t' | '\r' | NEWLINE) -> skip;

RELATIONALOP    : '>' | '>=' | '<' | '<=' | '=' | '<>';

ARITHMETICOP    : '+' | '-' | '*' | '/';

PUNCTUATION     : '(' | ')' | ',' | ':' | '[' | ']';



/*sintacticas*/

program 	: NEWLINE* declaration (declaration)* EOF;

declaration     : function | global;

newLine       	: NEWLINE NEWLINE*;

global   	: declvar newLine; 

function  	: 'fun' IDENTIFIER '(' parameters? ')' (':' type)? newLine 	
                /*java code*/
		{ System.out.println("Funcion:\n\tNombre="+$IDENTIFIER.text+", Tipo="+$type.text); }				
		block 'end' NEWLINE;

block   	: (declvar newLine)*(cmd=command 
                /*java code*/
		{ System.out.println("Tipo de comando:\n\t"+$cmd.X); } 
		newLine)*;
 
parameters   	: parameter (',' parameter)*;

parameter	: IDENTIFIER ':' type;

type     	: baseType | '[' ']' type;

baseType 	: 'int' | 'bool' | 'char' | 'string';

declvar  	: IDENTIFIER ':' type
                /*java code*/
		{ System.out.println("Declaracion:\n\tNombre="+$IDENTIFIER.text+", Tipo="+$type.text); };

command  returns [ String X ]: 
		commandIf       
                    { $X = "if"; }
		| commandWhile  
                    { $X = "while"; }
		| commandAsign  
                    { $X = "asign"; }
		| commandReturn 
                    { $X = "return"; }
		| call   
                    { $X = "call"; };

commandIf    	: 'if' expression newLine block ('else' 'if' expression newLine block)* ('else' newLine block)? 'end';

commandWhile 	: 'while' expression newLine block 'loop';

commandAsign 	: variable '=' expression
                /*java code*/
		{ System.out.println("Variable:\n\t"+$variable.text+" = "+$expression.text); };

call  		:  IDENTIFIER '(' expressionList? ')';

expressionList 	: expression (',' expression)*;

commandReturn	: 'return' expression | 'return';

variable      	: IDENTIFIER | variable '[' expression ']';

expression      : NUMERICLITERAL 
				| STRINGLITERAL 
				| TRUE | FALSE 
				| variable 
				| 'new' '[' expression ']' type 
				| '(' expression ')' 
				| call
				| expression '+' expression 
				| expression '-' expression 
				| expression '*' expression 
				| expression '/' expression 
				| expression '>' expression 
				| expression '<' expression 
				| expression '>=' expression 
				| expression '<=' expression 
				| expression '=' expression 
				| expression '<>' expression 
				| expression 'and' expression 
				| expression 'or' expression 
				| 'not' expression | '-' expression;



