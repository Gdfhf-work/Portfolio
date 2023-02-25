/*
 * Autor: MCS Solutions
 * Localidad: Mazatlan, Sinaloa, Mexico
 * Fecha: 10/10/2022
 */
package operaciones;

import java.io.Serializable;
import java.util.ArrayList;
import objetos.Nodo;

public class ListaNodo extends ArrayList<Nodo> implements Serializable{

    public ListaNodo(){
        super();
    }
    public Nodo buscarMenor(){
        Nodo aux = new Nodo();
        aux.setLongitudCamino(9999999);

        for(Nodo nodo:this){
            if(nodo.getLongitudCamino() < aux.getLongitudCamino()){
                aux = nodo;                
            }
        }

        return aux;
    }
    public boolean isContenido(Nodo nodo){
        boolean retornado = false;
        for(Nodo n:this){
            if(n == nodo){
                retornado = true;
            }
        }
        return retornado;
    }
}