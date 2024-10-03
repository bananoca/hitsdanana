package funcoes;

import java.util.Scanner;

public class salario8 {
    public static void main(String[] args) {
        int ganhoporhora;
        int horastrabalhadasdia;
        int totalmes;

        Scanner input = new Scanner(System.in);

        System.out.println("Insira o número de ganho por hora");
        ganhoporhora = input.nextInt();
        System.out.println("Insira o número de horas trabalhadas ao dia");
        horastrabalhadasdia = input.nextInt();

        totalmes = ganhoporhora * horastrabalhadasdia * 24;

        System.out.println("Seu salário mensal é: " + totalmes);
    }
}