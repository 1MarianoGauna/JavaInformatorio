import java.util.Scanner;

public class EntradaNumeros {
    public static void main (String args[]){
        Scanner empty = new Scanner(System.in);
        int numeroUno = empty.nextInt();
        int numeroDos = empty.nextInt();
        System.out.println(numeroUno + numeroDos);
        System.out.println(numeroUno - numeroDos);
        System.out.println(numeroUno * numeroDos);
        System.out.println(numeroUno / numeroDos);
        System.out.println(numeroUno % numeroDos);
    }
}
