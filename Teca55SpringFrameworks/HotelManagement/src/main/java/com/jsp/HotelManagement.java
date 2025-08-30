package com.jsp;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.configuration.HotelConfig;

/**
 * Hello world!
 *
 */
public class HotelManagement 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new AnnotationConfigApplicationContext(HotelConfig.class);
        System.out.println(Arrays.toString(context.getBeanDefinitionNames()));
    }
}
