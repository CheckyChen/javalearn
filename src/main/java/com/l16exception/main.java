package com.l16exception;

import com.sun.javaws.exceptions.InvalidArgumentException;
import com.sun.org.apache.xml.internal.security.signature.InvalidDigestValueException;

import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {

    public static void main(String[] args) {

        // exceptionTest();
        // exceptionFinally();
        // exceptionTest1();
        throwsFunction("");
    }


    static void exceptionTest() {
        try {
            int a = 1;
            int b = 0;
            double c = a / b;
        } catch (Exception ex) {
            System.out.println("getMessage: " + ex.getMessage());
            System.out.println("toString: " + ex.toString());
            ex.printStackTrace();
        }
    }

    static void exceptionFinally() {
        try {
            System.out.println("try start.");
            int a = 1;
            int b = 0;
            double c = a / b;
            System.out.println("try end.");
        } catch (Exception ex) {
            System.out.println("toString: " + ex.toString());
        } finally {
            // try 执行完后会执行 finally 块，不管 try 是否发生异常
            System.out.println("finally.");
        }

        System.out.println("function end.");

        /*   方法的输出顺序
         *   try start.
         *   toString: java.lang.ArithmeticException: / by zero
         *   finally
         *   function end.
         */
    }

    static void exceptionTest1() {

        // try 捕捉到异常，根据异常信息进入到对应的 catch 分支里
        try {
            // throw new IllegalArgumentException();
            // throw new NullPointerException();
            throw new SecurityException();
        } catch (IllegalArgumentException ex) {
            System.out.println("IllegalArgumentException");
        } catch (NullPointerException ex) {
            System.out.println("NullPointerException");
        } catch (Exception ex) {
            System.out.println("Exception");
        }
    }

    static void throwsFunction(String name) throws IllegalArgumentException {

        if (name == null || name == "") {
            throw new IllegalArgumentException("参数错误。");
        }
        System.out.println(name);
    }

    static void throwsFunction1() throws IOException {
        throw new IOException();
    }
}
