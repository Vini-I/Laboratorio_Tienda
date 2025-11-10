/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clientes;

/**
 *
 * @author jprod
 */
public class ClienteDto {
    private final String id;
    private final String nombre;
    private final String email;
    private final String telefono;

    public String getId(){ return id; }
    public String getNombre(){ return nombre; }
    public String getEmail(){ return email; }
    public String getTelefono(){ return telefono; }

    public ClienteDto(String id, String nombre, String email, String telefono) {
        this.id=id; 
        this.nombre=nombre; 
        this.email=email; 
        this.telefono=telefono;
    }
    
}
