package com.epam.module3.task02;

import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

/**
 * Created by pxjok on 26.10.2015.
 */
public class Task02 {
    public static void main(String[] args) {
        String questions = "com.epam.module3.task02.resources.questions";
        String answers = "com.epam.module3.task02.resources.answers";
        QA qa = null;
        boolean working = true;
        int input;
        System.out.println("1. English");
        System.out.println("2. Русский");
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Choose number.");
            input = scanner.nextInt();
            switch (input) {
                case 1:
                    Locale us = Locale.US;
                    qa = new QA(questions, answers, Locale.FRANCE);
                    working = false;
                    break;
                case 2:
                    Locale rus = new Locale("ru", "RU");
                    qa = new QA(questions, answers, rus);
                    working = false;
                    break;
                default:
                    System.out.println("Wrong Param.");
                    break;
            }

            qa.printQuestions();


            input = scanner.nextInt();
            if (input > 0 && input <= qa.getQuestionsNumber()) {
                qa.printAnswer(String.valueOf(input));
            } else {
                System.out.println("Wrong Param.");
            }

        }
    }


}