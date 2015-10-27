package com.epam.module3.task02;

import java.util.Collections;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Set;

/**
 * Created by pxjok on 27.10.2015.
 */
public class QA {
    private ResourceBundle questions;
    private ResourceBundle answers;

    public QA(String questions, String answers, Locale locale) {
        this.questions = ResourceBundle.getBundle(questions, locale);
        this.answers = ResourceBundle.getBundle(answers, locale);
    }

    public void printQuestions() {
        for (int i = 1; i <=questions.keySet().size(); i++){
            String q = questions.getString(String.valueOf(i));
            System.out.println(i + ". " + q);
        }
    }

    public int getQuestionsNumber(){
        return questions.keySet().size();
    }

    public void printAnswer(String key){
        System.out.println(answers.getString(key));
    }


}
