/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mar_i
 */
import java.util.Scanner;
import java.lang.Math;

public class Potencia {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        int numeroUno = entrada.nextInt();
        int numeroDos = entrada.nextInt();
        double total = Math.pow(numeroUno, numeroDos);
        System.out.println(total);
    }
}
