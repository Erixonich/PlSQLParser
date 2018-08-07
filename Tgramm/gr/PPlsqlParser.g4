parser grammar PPlsqlParser;


options { tokenVocab=PPlsqlLexer; }
create_package
    :
    (fun|proc|block)*;

fun
    :
    FUNCTION
    BEGIN
      block*
    END_F;
proc
    :
    PROCEDURE
      BEGIN
        block*
      END_F;

block
    :(BEGIN block* END_)
    |(LOOP block* END_LOOP)
    |(IF block* END_IF);
