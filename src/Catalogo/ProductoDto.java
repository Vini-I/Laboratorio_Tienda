/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Catalogo;

/**
 *
 * @author jprod
 */
public class ProductoDto {
    private final String codigo; // único visible al usuario
    private final String nombre;
    private final double precio;
    private final int stock;
    private final int categoria;
    
    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }
    public int getStock() { return stock; }
    public int getCategoria() { return categoria; }

    public ProductoDto(String codigo, String nombre, double precio, int stock, int categoria) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.categoria = categoria;
    }

}
