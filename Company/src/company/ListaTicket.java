/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package company;

/**
 *
 * @author cat_dominguez
 */
public class ListaTicket <T>{
    Elemento<T> inicio, pivote;
    int nelementos2;
    
    public ListaTicket(){
        inicio=pivote=null;
        nelementos2= 0;
    }
    
    public ListaTicket(Elemento<T> objeto){
        inicio= pivote= objeto;
        nelementos2 = 1;
    }
    
    public void agregar(Elemento objeto){
        if(nelementos2==0) {
            inicio = pivote = objeto;
        }else{
            objeto.siguiente= inicio;
            pivote=inicio = objeto;
        }
        nelementos2 ++;
    }
    
    public String recorre(){
        String datos="";
        pivote=inicio;
        for(int i=0; i<nelementos2; i++){
           datos += pivote.attrG.toString();
           pivote=pivote.siguiente;
        }
        return datos;
        
    }
    
    public void eliminar(){
        inicio=inicio.siguiente;
        nelementos2--;
        if (nelementos2==0){
            inicio = pivote = null;
        }
    }
    
    
}
