/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Catalogo;

/**
 *
 * @author jprod
 */
public class CategoriaDto {
    private final int id;
    private final String nombre;
    private final String descripcion;
    private final boolean activa;

    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public String getDescripcion() { return descripcion; }
    public boolean isActiva() { return activa; }
 
    public CategoriaDto(int id, String nombre, String descripcion, boolean activa) {
        this.id = id; this.nombre = nombre; this.descripcion = descripcion; this.activa = activa;
    }

}
