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
public class ArticuloPerecedero {
    public String nombre;
    public String clave;
    public String descripcion;
    public float precio;
    public String fecha;
    public int existencia;

    public ArticuloPerecedero(){
        nombre="";
        clave="";
        descripcion="";
        precio=0;
        fecha="";
        existencia=0;
    }
    public ArticuloPerecedero(String n, String c, String d, float p, String f, int e) {
        nombre = n;
        clave = c;
        descripcion = d;
        precio = p;
        fecha = f;
        existencia = e;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getClave(){
        return clave;
    }
    public void setClave(String clave){
        this.clave=clave;
    }
    public String getDescripcion(){
        return descripcion;
    }
    public void setDescripcion(String descripcion){
        this.descripcion=descripcion;
    }
    public float getPrecio(){
        return precio;
    }
    public void setPrecio(float precio){
        this.precio=precio;
    }
    public String getFecha(){
        return fecha;
    }
    public void setFecha(String fecha){
        this.fecha=fecha;
    }
    
    public int getExistencia(){
        return existencia;
    }
    
    public void setExistencia(int existencia){
        this.existencia=existencia;
    }

    @Override
    public  String toString(){
        return "Nombre: "+nombre+", Clave: "+clave+", Descripcion: "+descripcion+", Precio: $"+precio+", Fecha de lanzamiento: "+fecha+ ", Existencia: " +existencia +"\n";
    }
}