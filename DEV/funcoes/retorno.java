package funcoes ;

public class retorno {
    public static void main(String[] args) {
        int resultado;
        resultado = soma();
        System.out.println("Resultado: " + resultado);
    }
    
    public static int soma() {
        int x = 15;
        int y = 20;
        int res;
        res = x + y;
        return res;

    }
}
