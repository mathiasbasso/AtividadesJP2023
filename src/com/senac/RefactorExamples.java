package com.senac;

public class RefactorExamples {
    public static void main(String[] args) {
        System.out.println(soma(3, 4));
    }

//        //ANTES DE REFATORAR
//    public static double salvaX(double x) {
//        double xSalvo = x;
//        return xSalvo;
//    }
//    public static double salvaY(double y){
//        double ySalvo = y;
//        return ySalvo;
//    }
//
//    public static double somaXeY(double x, double y) {
//        return salvaX(x)+ salvaY(y);

//    }


    public static double soma (double n1, double n2){
        return n1+n2;
    }


}
