import java.util.Scanner;

public class SecuenciaNumeros {
    public static void main(String args[]){
        Scanner entradas = new Scanner(System.in);
        int numero = entradas.nextInt();
        int num = 0;
        while(num <= numero)
        System.out.println(num++);
        }
    }
