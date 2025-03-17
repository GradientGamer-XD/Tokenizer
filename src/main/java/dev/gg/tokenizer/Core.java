package dev.gg.tokenizer;


import dev.gg.tokenizer.util.Processor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;
import java.util.Scanner;


public class Core {


    private static final Logger logger = LogManager.getLogger();

    public static void main(String[] text) {

        String inputField;


        Processor processor = new Processor();

        Scanner consoleInput = new Scanner(System.in);

        logger.info("Scanner Ready");
        System.out.println(" ");
        System.out.println("Do you want to launch the Web UI type 'yes' or 'no'.");

        inputField = consoleInput.nextLine();

        if (Objects.equals(inputField, "y") || Objects.equals(inputField, "yes") ) {

        } else if (Objects.equals(inputField, "n") || Objects.equals(inputField, "no")) {


            System.out.println(" ");
            System.out.println("Enter text to tokenize below");

            inputField = consoleInput.nextLine();
            logger.info("PROCESSING SENTENCE TO TOKEN");
            System.out.println(" ");

            System.out.println(processor.processToken(inputField));

            System.out.println(" ");
            logger.info("Processor Finished");
            System.out.println(" ");

        } else {
            logger.error("Invalid input entry. Program will close");
        }

        consoleInput.close();

    }

}
