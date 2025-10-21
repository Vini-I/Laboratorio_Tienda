/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Catalogo;

/**
 *
 * @author jprod
 */
public class Producto {
    private String codigo; // único visible al usuario
    private String nombre;
    private double precio;
    private int stock;
    private Categoria categoria;
    
    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }
    public int getStock() { return stock; }
    public Categoria getCategoria() { return categoria; }
    
    public void setNombre(String n){ this.nombre=n; }
    public void setPrecio(double p){ this.precio=p; }
    public void setStock(int s){ this.stock=s; }
    public void setCategoria(Categoria c){ this.categoria=c; }

    private Producto(ProductBuilder builder) {
        this.codigo = builder.codigo;
        this.nombre = builder.nombre;
        this.precio = builder.precio;
        this.stock = builder.stock;
        this.categoria = builder.categoria;
    }

    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + ", stock=" + stock + ", categoria=" + categoria + '}';
    }
    
    public static class ProductBuilder {
        private String codigo;
        private String nombre;
        private double precio;
        private int stock;
        private Categoria categoria;

        public ProductBuilder setCodigo(String codigo) {
            this.codigo = codigo;
            return this;
        }

        public ProductBuilder setNombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        public ProductBuilder setPrecio(double precio) {
            this.precio = precio;
            return this;
        }

        public ProductBuilder setStock(int stock) {
            this.stock = stock;
            return this;
        }

        public ProductBuilder setCategoria(Categoria categoria) {
            this.categoria = categoria;
            return this;
        }

        public Producto build() {
            return new Producto(this);
        }
    }

}
