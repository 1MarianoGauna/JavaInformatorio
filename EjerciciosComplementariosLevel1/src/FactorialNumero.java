/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mar_i
 */
public class FactorialNumero {
    public static void main(String args[]){
        double factorial = 1;
        double numero = 5;
        while(numero!=0){
            factorial=factorial*numero;
            numero--;
        }
        System.out.println(factorial);
    }
    
}
