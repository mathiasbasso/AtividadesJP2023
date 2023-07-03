package com.senac;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int fome, dinheiro;
        System.out.println("está com fome?" +
                "\n - 1 Sim" +
                "\n - 2 Não");
        fome = entrada.nextInt();
        System.out.println("tem dinheiro?" +
                "\n - 1 Sim" +
                "\n - 2 Não");
        dinheiro = entrada.nextInt();


        if (fome == 1 && dinheiro==1){
            System.out.println("vá para a cantina");
        }else if (fome == 1 && dinheiro ==2){
            System.out.println("Trabalhar que é bom nada né?");
        }else if (fome == 2 && dinheiro ==1){
            System.out.println("Entao vai comprar looogo");
        }else if (fome ==2 && dinheiro ==2){
            System.out.println("Vai fazer alguma coisa meeu ");
        }else {
            System.out.println("Inválido");
        }

    }
}