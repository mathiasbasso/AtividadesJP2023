package refactor;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner escolha = new Scanner(System.in);
        double raio;
        System.out.println("Qual é o raio? ");
        raio= escolha.nextDouble();
        double perimentro  = 2 * Math.PI * raio;
        double volume = (4 * Math.PI * raio * raio * raio) / 3;
        double areaCirculo = 4 * Math.PI * raio * raio;
        double areaSuperficie = 4 * Math.PI * raio * raio;

        System.out.println("Perímetro: "+ perimentro+ "\n volume: "+ volume+
                "\n area do Circulo: "+ areaCirculo+ "\n Area da Superficie: "+ areaSuperficie);

    }

}
