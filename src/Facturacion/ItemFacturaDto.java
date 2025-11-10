/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Facturacion;

/**
 *
 * @author jprod
 */
public class ItemFacturaDto {
    private final String producto;
    private final int cantidad;
    private final double precioUnitario;

    public String getProducto(){ return producto; }
    public int getCantidad(){ return cantidad; }
    public double getPrecioUnitario(){ return precioUnitario; }
    
    public ItemFacturaDto(String producto, int cantidad, double precio) {
        this.producto=producto; 
        this.cantidad=cantidad; 
        this.precioUnitario=precio;
    }    

}
