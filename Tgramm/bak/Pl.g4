grammar Pl;


w : create_package;

create_package
    : WORD+
    (proc|fun|statement)+;
proc
    : PROCEDURE WORD+
    (statement*
    BEGIN
    block+
    END WORD? ';'|';');
fun
    : FUNCTION WORD+
    (statement*
    BEGIN
    block+
    END WORD? ';'|';');


block
    : (statement)+
    |(BEGIN block+ END ';')+
    |(IF block+ END IF ';')+
    |(LOOP block+ END LOOP ';')+ ;

statement : WORD+ ';'? ;




M_COMMENTS : '/*' .*? '*/' -> skip;//channel(HIDDEN);
S_COMMENTS : '--' ~('\n'|'\r')* -> skip;//channel(HIDDEN);
STRING : '\'' .*? '\'' -> skip;//channel(HIDDEN);
PROCEDURE : 'PROCEDURE';
FUNCTION : 'FUNCTION';
BEGIN : 'BEGIN';
END : 'END';
IF : 'IF';
LOOP : 'LOOP';
SEMICOLON : ';';
PAR_L : '('  -> skip;
PAR_R : ')' -> skip;

WORD : ~[ \t\n\r;')(]+;
WS : [ \t\n\r]+ -> skip;