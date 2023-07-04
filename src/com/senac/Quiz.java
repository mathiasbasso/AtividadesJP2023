package com.senac;

import javax.swing.*;

public class Quiz {
    public static void main(String[] args) {
        Integer pontos = 0 ;
        JOptionPane.showMessageDialog(null, "Seja bem-vindo ao quiz do senac!");
        String nomeJogador = JOptionPane.showInputDialog("Digite seu nome");
        JOptionPane.showMessageDialog(null, "O que significa Senac? ");
        String quiz1 = JOptionPane.showInputDialog(
                "\n A - Centro para loucos" +
                        "\n B - Serviço ao consumidor" +
                        "\n C - Servilo nacional de aprendizagem comercial");
        if (quiz1.equals("C") || quiz1.equals("c")) {
            JOptionPane.showMessageDialog(null, "ACERTOOOO MIZERAAVIII " + nomeJogador);
            pontos = 1;
        }else if (quiz1 != ("C") || quiz1 !=("c")){
            JOptionPane.showMessageDialog(null, "ERROUUUUUUU " + nomeJogador);
        }else {
            JOptionPane.showMessageDialog(null, "viajou, chegou a travar aqui " + nomeJogador);
        }
        JOptionPane.showMessageDialog(null, "Você acertou um total de "+pontos+ " perguntas!");



    }

}
