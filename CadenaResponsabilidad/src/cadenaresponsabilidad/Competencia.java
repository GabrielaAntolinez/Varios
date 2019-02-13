/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadenaresponsabilidad;

import java.util.Scanner;

/**
 *
 * @author angiegabrielaantolinezsegura
 */
public class Competencia {
    public static void main(String[] args) {
        CadenaResponsabilidad conoce = new CadenaResponsabilidad();
        
        System.out.println("Ingrese el tipo de proceso: ");
        Scanner sc = new Scanner(System.in);
        String proceso = sc.nextLine();
        System.out.println("Ingrese el número de smlmv: ");
        Scanner teclado = new Scanner(System.in);
        long cuantia = sc.nextInt();
        conoce.CalcularCompetencia(proceso, cuantia);
    
            
    }
}
    
