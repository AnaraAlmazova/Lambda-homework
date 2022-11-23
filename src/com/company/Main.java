package com.company;

public class Main {

    public static void main(String[] args) {
     sqrt(9.0);

    }
    public static UnaryOperator<Double> sqrt(Double t) {

            UnaryOperator<Double>unaryOperator  = new UnaryOperator<Double>() {
                @Override
                public void sqrt(Double aDouble) {
                    System.out.println(Math.sqrt(t));
                }
            };

            unaryOperator.sqrt( t);
            return unaryOperator;


        }
    }