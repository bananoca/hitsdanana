package funcoes;

import java.util.Scanner;

public class parimpar {    
    public static void main(String[]args){
        
    int n1;

    try (Scanner input = new Scanner(System.in)) {
        System.out.println("Insira o valor de n1");
            n1 = input.nextInt();
    }
    if (n1% 2 == 0) {
        System.out.println("O valor é par");
    }    
    if (n1% 2 != 0) {
        System.out.println("O valor é ímpar");
    }  

    } 

}