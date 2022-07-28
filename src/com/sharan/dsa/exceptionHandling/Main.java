package com.sharan.dsa.exceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try {
            //divide(a, b);
            String name = "sharan";
            if (name.equals("sharan")) {
                throw new MyException("name is sharan");
            }
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (MyException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("this will always execute");
        }
    }

    static int divide(int a, int b) throws ArithmeticException{
        if (b == 0) {
            throw new ArithmeticException("Please do not divide by zero");
        }
        return a / b;
    }
}
