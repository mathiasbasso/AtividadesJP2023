package refactor;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner escolha = new Scanner(System.in);
        double raio;
        System.out.println("Qual é o raio? ");
        raio= escolha.nextDouble();
        double perimentro  = 2 * Math.PI * raio;
        double volume = (4 * Math.PI * Math.pow(raio,3)) / 3;
        double areaCirculo = 4 * Math.PI * Math.pow(raio,2);
        double areaSuperficie = 4 * Math.PI * Math.pow(raio,2);

        System.out.println("Perímetro: "+ perimentro+ "\n volume: "+ volume+
                "\n area do Circulo: "+ areaCirculo+ "\n Area da Superficie: "+ areaSuperficie);

    }

}
