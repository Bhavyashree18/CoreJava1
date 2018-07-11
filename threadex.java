import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Date;
//package javabasic;
class testthread extends Thread
{
   
public static void main (String[] args) {
        testthread t1=new testthread();
        Calendar c=Calendar.getInstance();
        System.out.println(t1.getName());
        t1.start();
        t1.setName("Mythread");
        System.out.println(t1.getName());
        System.out.println(new Date());
        try {
            Thread.sleep(10000);
             System.out.println(new Date());
            
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
       
    }
