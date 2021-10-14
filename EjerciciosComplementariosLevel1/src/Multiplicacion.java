
import java.util.Scanner;
public class Multiplicacion {
    public static void main(String args[]){
        Scanner pedir = new Scanner(System.in);
        int numeroUno = pedir.nextInt();
        int numeroDos = pedir.nextInt();
        int total = numeroUno * numeroDos;
        System.out.println(total);
    }
}
