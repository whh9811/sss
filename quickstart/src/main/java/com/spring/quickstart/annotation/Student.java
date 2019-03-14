package com.spring.quickstart.annotation;


/**
 * Created by MAIBENBEN on 2019/2/28.
 */
@Component
@Data
public class Student {
    @Value("小红")
    private String name;

    @Value("18")
    private int age;

    @Value("6666.66")
    private Phone price;
}
