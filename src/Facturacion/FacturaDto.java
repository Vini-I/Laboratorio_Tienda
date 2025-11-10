/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Facturacion;

/**
 *
 * @author jprod
 */
public class FacturaDto {
    private final int numero;
    private final String cliente;
    private final String fecha;
    private final String estado;
    
    public int getNumero(){ return numero; }
    public String getCliente(){ return cliente; }
    public String getFecha(){ return fecha; }
    public String getEstado(){ return estado; }

    public FacturaDto(int numero, String cliente, String fecha, String estado) {
        this.numero=numero; 
        this.cliente=cliente; 
        this.fecha= fecha;
        this.estado = estado;
    }
    
}
