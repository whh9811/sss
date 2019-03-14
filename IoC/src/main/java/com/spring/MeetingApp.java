package com.spring;

import com.spring.di.MessagePrinter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lenovo on 2019/3/4.
 */
public class MeetingApp {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("/spring.xml");
        Meeting meeting=(Meeting)context.getBean("meeting");
        System.out.println(meeting.toString());
    }
}
