package com.epam.java_basic;
im[port com.java.epam_basic.calculator.Calculator;
import java.util.*;
public class Application{

    public static void main(String[] args){
        do{
           double a,b;
           char opr;
           char count;
           Calculator c= new Calculator();
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter the first number:");
           a=sc.nextDouble();
           System.out.println("Enter the second number:");
           b=sc.nextDouble();
           System.out.println("Enter operator(+,-,*,/):");
           opr = sc.next().charAt(0);
           if(opr == '+')
              System.out.println(c.add(a,b));
           else if (opr == '-')
              System.out.println(c.subract(a,b));
           else if (opr == '*')
              System.out.println(c.multiply(a,b));
           else if (opr == '/')
              System.out.println(c.divide(a,b));
           System.out.println("Do you want to continue?(Y/N)");
           cont = sc.next().charAt(0);
           if (count=='N'|| count=='n')
              System.out.println("BYE!");
           break;
       }while(true);
}
