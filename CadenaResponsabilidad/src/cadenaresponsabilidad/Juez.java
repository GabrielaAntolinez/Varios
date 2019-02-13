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
public abstract class Juez {
    Juez juez;

	public void setNext(Juez juez){
            this.juez = juez;
        }
	public Juez getNext(){
            return juez; }
        
	public abstract void CalcularCompetencia(String proceso, long cuantia);
}

