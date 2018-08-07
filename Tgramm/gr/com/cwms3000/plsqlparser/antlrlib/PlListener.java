// Generated from com\cwms3000\plsqlparser\antlrlib\Pl.g4 by ANTLR 4.7
package com.cwms3000.plsqlparser.antlrlib;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PlParser}.
 */
public interface PlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PlParser#package_body}.
	 * @param ctx the parse tree
	 */
	void enterPackage_body(PlParser.Package_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlParser#package_body}.
	 * @param ctx the parse tree
	 */
	void exitPackage_body(PlParser.Package_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(PlParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(PlParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlParser#procedure}.
	 * @param ctx the parse tree
	 */
	void enterProcedure(PlParser.ProcedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlParser#procedure}.
	 * @param ctx the parse tree
	 */
	void exitProcedure(PlParser.ProcedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(PlParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(PlParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(PlParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(PlParser.BlockContext ctx);
}