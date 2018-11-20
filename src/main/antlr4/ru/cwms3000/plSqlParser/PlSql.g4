grammar PlSql;

@members {
   int nesting = 0;
}

package_body : (WORD)+
    (procedure|function|WORD)+;


function
    :FUNCTION name=WORD
    (WORD|function|procedure)+
    body;

procedure
    :PROCEDURE name=WORD
     (WORD|function|procedure)+
     body;
body :
    BEGIN
    (WORD|block)+
    END_F;
block
    :(BEGIN (WORD|block)+ END_B);


M_COMMENTS : '/*' .*? '*/' -> skip;//channel(HIDDEN);
S_COMMENTS : '--' ~('\n'|'\r')* -> skip;//channel(HIDDEN);
STRING : '\'' .*? '\'' -> skip;//channel(HIDDEN);

PROCEDURE : 'PROCEDURE';
FUNCTION : 'FUNCTION';
END_F : END (WS WORD)? WS? SEMICOLON
{nesting == 1
&& !(getText().matches(".*\\s+IF\\s*;.*")
   ||getText().matches(".*\\s+CASE\\s*;.*")
   ||getText().matches(".*\\s+LOOP\\s*;.*"))}?
{nesting--;} ;
//{System.out.println(!(getText().contains("IF")||getText().contains("CASE")||getText().contains("LOOP")));}
BEGIN : 'BEGIN' {nesting++;};
END_B : END WS? SEMICOLON {nesting > 0}? {nesting--;};
fragment
END : 'END';
fragment
IF : 'IF';
//FOR : 'FOR';
fragment
CASE : 'CASE';
//WHILE : 'WHILE';
fragment
LOOP : 'LOOP';
fragment
SEMICOLON : ';' ;


WORD :([A-Z]| '$' | '_' | '#'|'.'|[0-9])+ ;
WS : [ \t\n\r]+ -> skip;
//SPEC_SYMB : ([{(=*)}@_+!|&%^,:><]'-'|'/') -> skip;
ANY : . -> skip;
