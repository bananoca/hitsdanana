package funcoes;

import java.util.Scanner;

public class temperatura {
    public static void main(String[] args) {
        int grausfahreint;
        int celsius;
        Scanner input = new Scanner(System.in);

        System.out.println("Insira a temperatura em Fahreint ");
        grausfahreint = input.nextInt();
       
         celsius = 5*((grausfahreint - 32) /9);

         System.out.println("A temperatura em graus Celsius é: " + celsius);
         input.close();
    }
}
