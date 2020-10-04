package com.lab2;

import com.lab2.PencilBox.PencilBox;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab2Application {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new
                ClassPathXmlApplicationContext("applicationContext.xml");
        PencilBox pencilBox = context.getBean("pencilBoxBean", PencilBox.class);
        pencilBox.print();
        context.close();
    }

}
