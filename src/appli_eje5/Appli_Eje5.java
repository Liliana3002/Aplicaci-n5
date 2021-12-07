/*La calificación final de un estudiante de informática 
se cálcula con base a las calificaciones 
de cuatro aspectos de su rendimiento académico:
participación, 1 exmane, 2 examen y examen final.
Sabiendo que las calificaciones anteriores entran a la calificación final 
con ponderaciones del 10%, 25%, 25% y 40%
Hacer un programa que cálcule e imprima 
la calificación final obtenida por un estudiante*/
package appli_eje5;

import java.util.Scanner;

public class Appli_Eje5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        float notap, nota1, nota2, examenf, notaF;
        
        //Pedir los datos necesarios
        System.out.println("Digite la nota de participación: ");
        notap = entrada.nextFloat();
        
        System.out.println("Digite la nota del primer éxamen parcial: ");
        nota1 = entrada.nextFloat();
        
        System.out.println("Digite la nota del segundo éxamen parcial: ");
        nota2 = entrada.nextFloat();
        
        System.out.println("Digite la nota del éxamen final: ");
        examenf = entrada.nextFloat();
        
        //Sacar porcentajes de cad nota
        notap *= 0.10f;
        nota1 *= 0.25f;
        nota2 *= 0.25f;
        examenf *= 0.40f;
        
        // Sacar la nota final 
        notaF = notap+nota1+nota2+examenf;
        
        //Imprimir el resultado en pantalla
        System.out.println("\nLa nota final es: "+notaF);
    }
    
}
