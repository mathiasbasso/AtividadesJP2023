package com.senac;

import java.util.Scanner;

public class UsuarioProduto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int preco1, preco2, preco3;

        String resposta1, resposta2, resposta3;
        System.out.println("Entre com o nome do primeiro produto: \n");
        resposta1 = entrada.next();
        System.out.println("Qual o valor deste primeiro produto?: \n ");
        preco1 = entrada.nextInt();
        System.out.println("Entre com o nome do segundo produto: \n");
        resposta2 = entrada.next();
        System.out.println("Qual o valor deste segundo produto?: \n ");
        preco2 = entrada.nextInt();
        System.out.println("Entre com o nome do terceiro produto: \n");
        resposta3 = entrada.next();
        System.out.println("Qual o valor deste terceiro produto?: \n ");
        preco3 = entrada.nextInt();

        if (preco1 < preco2 &&  preco1 < preco3){
            System.out.println("o produto "+ resposta1+ "é o mais barato, custa apenas "+preco1+ " R$");
        }else if (preco2 < preco1 && preco2 < preco3){
            System.out.println("o produto "+ resposta2+ "é o mais barato, custa apenas "+preco2+ " R$");
        }else {
            System.out.println ("o produto "+ resposta3+ "é o mais barato, " +
                    "custa apenas "+preco3+ " R$");
        }


    }
}
