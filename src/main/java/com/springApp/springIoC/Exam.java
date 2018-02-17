package com.springApp.springIoC;

/**
 * Model
 * @author Ihor Savchenko
 * @version 1.0
 */
public class Exam {
    private AnswerCheckerInterface answerChecker;
    private String subject;

    public Exam() {
        System.out.println("Exam constructor initiated.");
    }

    public AnswerCheckerInterface getAnswerChecker() {
        return answerChecker;
    }

    public void setAnswerChecker(AnswerCheckerInterface answerChecker) {
        this.answerChecker = answerChecker;
        System.out.println("We've just set answerChecker using setter.");
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void examCheck() {
        answerChecker.checkAnswer();
    }
}
