package refactor;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Qual operação deseja realizar?" +
                "\n 1 - Soma" +
                "\n 2 - Subtração" +
                "\n 3 - Multiplicação" +
                "\n 4 - Divisão");

        int operacao = sc.nextInt();

        System.out.println("Digite o primeiro número:");
        int numero1 = sc.nextInt();

        System.out.println("Digite o segundo número:");
        int numero2 = sc.nextInt();

        switch (operacao) {
            case 1:
                System.out.println(numero1 + numero2);
                break;
            case 2:
                System.out.println(numero1 - numero2);
                break;
            case 3:
                System.out.println(numero1 * numero2);
                break;
            case 4:
                System.out.println(numero1 / numero2);
                break;
        }
    }
}
