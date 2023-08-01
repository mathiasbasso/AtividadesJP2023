package refactor;

import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        Scanner escolha = new Scanner(System.in);
        int numero ;
        System.out.println("Escolha um numero  para ver seu resultado quando multiplicado de 1 até 10: ");
        numero = escolha.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + numero * i);
        }
    }
}
