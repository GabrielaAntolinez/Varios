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
public class CadenaResponsabilidad extends Juez {
    private Juez next;
    
	public void setNext(Juez juez) {
		next = juez;
	}

	public Juez getNext() {
		return next;
	}
        
	public void CalcularCompetencia(String proceso, long cuantia) {
            JuezMunicipal juezmun = new JuezMunicipal();
            this.setNext(juezmun);
            
            JuezCircuito juezcir = new JuezCircuito();
            juezmun.setNext(juezcir);
            
            Tribunal trib = new Tribunal();
            juezcir.setNext(trib);
            
            next.CalcularCompetencia(proceso, cuantia);
        
        
                }
      
}
