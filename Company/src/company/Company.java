/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package company;
import java.util.Scanner;
/**
 *
 * @author cat_dominguez
 */
public class Company {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
		ArticuloPerecedero a1 = new ArticuloPerecedero("Disco AC/DC", "1234", "Vinil", 599, "15/05/1990", 1);
		ArticuloPerecedero a2 = new ArticuloPerecedero("Michael Jackson", "5678", "CD", 69, "08/03/2000", 2);
		ArticuloPerecedero a3 = new ArticuloPerecedero("BIGBANG", "9012", "DVD", 299, "20/09/2016", 3);
                ArticuloPerecedero a4 = new ArticuloPerecedero("ASTRO", "3456", "Mini Album", 150, "29/05/2017", 5);
                
                Elemento<ArticuloPerecedero> primero = new Elemento<>(a1);
		Elemento<ArticuloPerecedero> segundo = new Elemento<>(a2);
		Elemento<ArticuloPerecedero> tercero = new Elemento<>(a3);
                Elemento<ArticuloPerecedero> cuarto = new Elemento<>(a4);

		ListaArticulo<ArticuloPerecedero> listaA = new ListaArticulo<>();
		listaA.insertar(cuarto);
                listaA.insertar(tercero);
		listaA.insertar(segundo);
		listaA.insertar(primero);

		Scanner sc = new Scanner(System.in);
                
                System.out.println("TIENDA DE DISCOS");
                System.out.println("Inventario");
                    System.out.print(listaA.recorrer());

                    System.out.println("Buscar por clave artículo por clave");
                    System.out.print("Inserta la clave del artículo a buscar: ");
                    String clave = sc.nextLine();
			if (listaA.recorrer().contains(clave)) {
				System.out.println("DISPONIBLE");
			}else{
				System.out.println("NO DISPONIBLE");
                        }
                        System.out.println();
                        
                    System.out.println("Comprobar stock");
                System.out.print("Inserta la clave del producto: ");
                String claveP = sc.nextLine();
		if (listaA.recorrer().contains(claveP)) {
                    System.out.print("Inserta el número de piezas a comprar: ");
                    String pedido = sc.next();
                    int pedidoInt= Integer.parseInt(pedido);
                    ArticuloPerecedero existenciass= new ArticuloPerecedero();
                    int exiss=existenciass.existencia;
                    if (listaA.recorrer().contains(pedido)){
                        System.out.println("ARTÍCULO NO DISPONIBLE EN STOCK");
                        ListaTicket<ArticuloPerecedero> listaT = new ListaTicket<>();
                        listaT.agregar(listaA.recorrer().equals(claveP));
                    }else{
                        System.out.println("ARTÍCULO EN STOCK");
                    }

                System.out.println();
                System.out.println("Calcular total de venta");
                System.out.print("Inserta la clave del artículo a vender: ");
                String claveV = sc.next();
                System.out.print("Ingresa la cantidad de artículos a vender: ");
                String num = sc.next();
                int num2= Integer.parseInt(num);
                ArticuloPerecedero precio= new ArticuloPerecedero();
                    if (listaA.recorrer().contains(claveV)){
                        float precioExterno=precio.precio;
                        float total = num2*precioExterno;
                        System.out.println("Total de venta: $" +total);
                    } 
                
                System.out.println();

                }
    
    }}