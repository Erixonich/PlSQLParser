package com.cwms3000.plsqlparser;

import com.cwms3000.plsqlparser.antlrlib.PlParser;
import com.cwms3000.plsqlparser.antlrlib.PlBaseListener;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Erixon on 18.10.2017.
 */
public class FunListener extends PlBaseListener {
    private Map<String, int[]> elms = new HashMap<String, int[]>();

    @Override
    public void enterFunction(PlParser.FunctionContext ctx) {
        addCtxToMap(ctx, ctx.name.getText() + "_FUN");
    }

    @Override
    public void enterProcedure(PlParser.ProcedureContext ctx) {
        addCtxToMap(ctx, ctx.name.getText() + "_PROC");
    }

    public void addCtxToMap(ParserRuleContext ctx, String name){
        if (ctx.getParent().getClass().getSimpleName().equals("Package_bodyContext")) {
            int i = 0;

            int[] bounds = {ctx.getStart().getStartIndex(), ctx.getStop().getStopIndex() + 1};
            //System.out.println(bounds[0] + " : " + bounds[1]);

            while (elms.containsKey(name + "_" + i)) i++;

            elms.put(name + "_" + i, bounds);
        }

    }

    public Map<String, int[]> getElms() {
        return elms;
    }

}
