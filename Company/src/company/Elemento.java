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
public class Elemento <T>{
    public T attrG;
    public Elemento siguiente;

    public Elemento(T objeto){
        this.attrG=objeto;
        this.siguiente=null;
    }

}
