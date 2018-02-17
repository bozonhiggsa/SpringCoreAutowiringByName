package com.springApp.springIoC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Entry point
 * @author Ihor Savchenko
 * @version 1.0
 */
public class ExamRunner {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("autowiring-by-name-config.xml");

        System.out.println("Context was created");
        Exam exam = (Exam) context.getBean("exam");
        exam.examCheck();
    }
}
