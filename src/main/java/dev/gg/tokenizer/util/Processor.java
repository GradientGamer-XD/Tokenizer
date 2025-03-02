package dev.gg.tokenizer.util;


import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Processor {

    private static final Pattern TOKEN_PATTERN = Pattern.compile("\\w+|\\d+|\\p{Punct}");

    private String words;


    //No Argument Constructor
    public Processor() {

    }


    //Produce token
    public List<String> processToken (String input) {
        List<String>tokens = new ArrayList<>();
        Matcher matcher = TOKEN_PATTERN.matcher(input);
        while (matcher.find()) {
            tokens.add(matcher.group());
        }
        return tokens;
    }


}