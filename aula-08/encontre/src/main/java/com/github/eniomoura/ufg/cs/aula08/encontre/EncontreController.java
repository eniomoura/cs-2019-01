package com.github.eniomoura.ufg.cs.aula08.encontre;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

public class EncontreController {

    static String line;
    static int lineNumber;
    static int matchCount;

    public static String encontre(final String filePath,
                                  final String matchWord) throws IOException {
        final File checkFile = new File(filePath);
        lineNumber=1;
        matchCount=0;
        if (checkFile.length() == 0) {
            throw new IllegalArgumentException("Não há texto no arquivo");
        }
        final Charset utf8 = Charset.forName("UTF-8");
        final BufferedReader br = Files.newBufferedReader(
            Paths.get(filePath), utf8);
        final StringBuilder sb = new StringBuilder();
        while ((line = br.readLine()) != null) {
            int colNumber = line.indexOf(matchWord);
            if (colNumber != -1) {
                sb.append(
                    String.format(
                    "L%d C%d: %s%n",
                    lineNumber,
                    colNumber,
                    line));
            }
            lineNumber++;
            matchCount += matchCounter(line, matchWord);
        }
        br.close();
        String rvalue = String.format("Encontradas: %d%n%s",
        matchCount, sb.toString());
        return rvalue;
    }

    public static int matchCounter(final String string,
                                   final String matchWord) {
        String[] words = string.split(" ");;
        int matches = 0;
        for (int i = 0; i < words.length; i++) {
            if (matchWord.equals(words[i])) {
                matches++;
            }
        }
        return matches;
    }
}