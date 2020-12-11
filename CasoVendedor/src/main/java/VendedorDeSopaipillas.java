import java.util.Random;
import java.util.Scanner;
public class VendedorDeSopaipillas {
    private int inventario;
    private int precio;
    private String nombre;
    private int pagar;


    public VendedorDeSopaipillas(String nombre){
        this.nombre = nombre;
        this.precio=crearPrecio();
        this.inventario=crearInventario();
    }

    public int getInventario() {

        return inventario;
    }


    public void setInventario(int inventario) {

        this.inventario = inventario;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int crearPrecio(){ //Crea precio de las sopaipillas
        int precio= 150;
        return precio;
    }

    public int crearInventario(){ //Crear una cantidad de sopaipillas disponibles para vender
        Random azar = new Random();
        this.inventario = inventario;
        inventario= 0;
        inventario = azar.nextInt(10)+1; //crear un inventario entre 0 y 10 sopaipillas
        return inventario;
    }

    public int vender(int cantidad){
        int pagar=150*cantidad;
        return pagar;
    }

    public void vender(){
        Scanner teclado= new Scanner(System.in);
        System.out.println("Cantidad vendida");
        int cantidad= teclado.nextInt();
        int pagar=150*cantidad;
        System.out.println("Total a pagar="+pagar);
        this.pagar=pagar;
    }


    public void ActualizarInventario(int cantidad){

        this.inventario=this.inventario-cantidad;
    }

    public void reponer(){
        crearInventario();
    }

    public int darVuelto(int dinero, int pagar){
        int devolver= dinero-pagar;
        return devolver;
    }

    public void darVuelto(){
        Scanner teclado= new Scanner(System.in);
        System.out.println("Con cuanto va a pagar?");
        int dinero= teclado.nextInt();
        int devolver= dinero-this.pagar;
        System.out.println("Se han devuelto"+ devolver);
    }
}
