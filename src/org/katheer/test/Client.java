package org.katheer.test;

import org.katheer.bean.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        /*
        If both autowiring and explicit wiring is done for same bean object,
            explicit wiring will override autowiring.
         */
        ApplicationContext context = new ClassPathXmlApplicationContext("org" +
                "/katheer/resource/applicationContext.xml");

        Student std1 = (Student) context.getBean("std1");
        std1.showStudentDetails();
    }
}
