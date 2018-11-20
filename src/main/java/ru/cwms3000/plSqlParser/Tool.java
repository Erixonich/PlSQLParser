package ru.cwms3000.plSqlParser;



import ru.cwms3000.plSqlParser.PlSqlLexer;
import ru.cwms3000.plSqlParser.PlSqlParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.*;
import java.nio.file.Files;
import java.util.*;


public class Tool {
    public static void main(String[] args) throws IOException {
        Map<Param, String> params = Param.parceParams(args);

        File file = new File(params.get(Param.INPUT_FILE));

        Map<String, String> sources;
        File fileOut;
        File fileErr = new File(String.format("%s/%s.err", params.get(Param.OUTPUT_DIRECTORY), file.getName()));
        StringWriter sw = new StringWriter();
        sw.write("Ok!");
        try {
            sources = getListFun(file);


            for (Map.Entry<String, String> source : sources.entrySet()) {
                fileOut = new File(String.format("%s/%s/%s.sql", params.get(Param.OUTPUT_DIRECTORY), file.getName().substring(0, file.getName().length()-4), source.getKey()));
                if (!fileOut.getParentFile().exists())
                    Files.createDirectories(fileOut.getParentFile().toPath());

                if (!fileOut.exists())
                    Files.createFile(fileOut.toPath());

                Files.write(fileOut.toPath(), source.getValue().getBytes());
            }

        }

        catch (RuntimeException e) {
            e.printStackTrace(new PrintWriter(sw));
        }

        Files.write(fileErr.toPath(), sw.toString().getBytes());
    }

    private static Map<String, String> getListFun(File file) throws IOException {
        Map<String, String> ret = new HashMap<>();

        String source = new String(Files.readAllBytes(file.toPath()), "UTF-8");
        System.out.println(source.length());
        String upperCaseSource = source.toUpperCase();
        System.out.println(upperCaseSource.length());
        try (ByteArrayInputStream inputStream = new ByteArrayInputStream(upperCaseSource.getBytes())) {

            CharStream input = CharStreams.fromStream(inputStream);

            PlSqlLexer lexer = new PlSqlLexer(input);

            CommonTokenStream tokens = new CommonTokenStream(lexer);

            PlSqlParser parser = new PlSqlParser(tokens);
            parser.removeErrorListeners();
            parser.addErrorListener(new CustomErrorListener());
            parser.setErrorHandler(new CustomErrorStrategy());
            ParseTree tree = parser.package_body();

            ParseTreeWalker walker = new ParseTreeWalker();

            FunListener listener = new FunListener();
            walker.walk(listener, tree);

            for (Map.Entry<String, int[]> entry : listener.getElms().entrySet()) {
                System.out.println(entry.getKey() + " = [" + entry.getValue()[0] + "," +entry.getValue()[1] + "]");

                ret.put(entry.getKey(), source.substring(entry.getValue()[0], entry.getValue()[1]));



            }

        }
        return ret;
    }


    private enum Param {
        INPUT_FILE(0, false), OUTPUT_DIRECTORY(1, false);

        private final int index;
        private boolean isOptional;

        Param(int index, boolean isOptional) {
            this.index = index;
            this.isOptional = isOptional;
        }

        public int index() {
            return index;
        }


        public boolean isOptional() {
            return isOptional;
        }

        private static Map<Param, String> parceParams(String[] args) {
            Map<Param, String> ret = new HashMap<>();


            for (Param param : Param.values()) {
                try {
                    ret.put(param, args[param.index()]);
                } catch (ArrayIndexOutOfBoundsException e) {
                    if (!param.isOptional())
                        throw new IllegalArgumentException("Bad param string " + param.index(), e);
                }
            }
            return ret;
        }
    }
}