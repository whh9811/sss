package com.spring.quickstart.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 采用注解和lombok开发的phone类
 * Created by MAIBENBEN on 2019/2/28.
 */
@Component
@Data
public class Phone {
    @Value("iPhone")
    private String brand;

    @Value("6666.66")
    private double price;
}
