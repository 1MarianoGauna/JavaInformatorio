/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mar_i
 */
import java.util.Scanner;

public class DatosDePersona {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        String nombreyapellido = entrada.nextLine();
        String direccion = entrada.nextLine();
        String ciudad = entrada.nextLine();
        int edad = entrada.nextInt();
        System.out.println(nombreyapellido + " - " + edad + " - " + direccion + " - " + ciudad);
    }
}
