lexer grammar PPlsqlLexer;

@lexer::members {
   int nesting = 0;
}

M_COMMENTS : '/*' .*? '*/' -> channel(HIDDEN);
S_COMMENTS : '--' ~('\n'|'\r')* -> channel(HIDDEN);
STRING : '\'' .*? '\'' -> channel(HIDDEN);
PROCEDURE : 'PROCEDURE';
FUNCTION : 'FUNCTION';
ID
END_IF : 'END' WS+ 'IF' WS* ';';
END_LOOP : 'END' WS+ 'LOOP' WS* ';';
END_ : 'END' WS* ';';
END_F : 'END' WS* [A-Z] ([A-Z]| '$' | '_' | '#' | [0-9])* WS*';';
BEGIN : WS+ 'BEGIN' WS+ {nesting++;};
LOOP : (WS|')') 'LOOP' WS+;
IF : (WS|')') 'IF' WS+;

WS : [ \t\n\r]+ -> skip;
ANY : . -> more;//channel(HIDDEN);