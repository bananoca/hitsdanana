package funcoes;

import java.util.Scanner;

public class posneg {    
    public static void main(String[]args){
        
    int n1;

    Scanner input = new Scanner (System.in); 
        System.out.println("Insira o valor de n1");
            n1 = input.nextInt();
            if (n1 > 0) {
                System.out.println("O valor é positivo");
        }    
            else if (n1 < 0) {
        System.out.println("O valor é negativo");
        }  

    } 

}