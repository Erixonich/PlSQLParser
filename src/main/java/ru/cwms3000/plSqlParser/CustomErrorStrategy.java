package ru.cwms3000.plSqlParser;

import org.antlr.v4.runtime.DefaultErrorStrategy;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;

import java.io.Serializable;


public class CustomErrorStrategy extends DefaultErrorStrategy{
    @Override
    public void recover(Parser recognizer, RecognitionException e) {
        throw e;
    }


}
