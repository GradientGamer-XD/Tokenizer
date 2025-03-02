package dev.gg.tokenizer;


import dev.gg.tokenizer.util.Processor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;


public class Core {


    private static final Logger logger = LogManager.getLogger();

    public static void main(String[] text) {

        String Sentence;

        Processor processor = new Processor();

        Scanner consoleInput = new Scanner(System.in);

        logger.info("Scanner Ready");
        System.out.println("Enter Words to process Below");

        Sentence = consoleInput.nextLine();

        logger.info("PROCESSING SENTENCE TO TOKEN");

        System.out.println(processor.processToken(Sentence));







    }

}
