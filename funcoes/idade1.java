package funcoes;

import java.util.Scanner;

public class idade1 {    
    public static void main(String[]args){
        
    int anos, meses, dias, resultado;

    Scanner input = new Scanner(System.in);
    System.out.println("Insira a idade em anos: ");
        anos = input.nextInt();
        System.out.println("Insira a idade em meses: ");
        meses = input.nextInt();
        System.out.println("Insira a idade em dias: ");
        dias = input.nextInt();

        resultado = (anos * 365) + (meses * 30) + dias;
        System.out.println("Resultado final " + resultado);
        
        input.close();


    } 

}


