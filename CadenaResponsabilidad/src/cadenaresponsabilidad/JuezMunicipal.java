/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadenaresponsabilidad;

/**
 *
 * @author angiegabrielaantolinezsegura
 */
public class JuezMunicipal extends Juez{	

    	private Juez next;

	@Override
	public void setNext(Juez juez) {
		next = juez;
	}

	@Override
	public Juez getNext() {
		return next;
	}
    
        
	@Override
	public void CalcularCompetencia(String proceso, long cuantia) {
		if(proceso.equals("Normal") && cuantia < 20){
                    System.out.println("Este proceso lo conoce el Juez Laboral Municipal");
		}else{
			next.CalcularCompetencia(proceso, cuantia);
		}
	}
	

}
