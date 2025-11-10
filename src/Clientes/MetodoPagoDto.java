/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clientes;

/**
 *
 * @author jprod
 */
public class MetodoPagoDto {
    private final int id;
    private final String tipo;
    private final String detalles;
    private final String cliente;

    public int getId(){ return id; }
    public String getTipo(){ return tipo; }
    public String getDetalles(){ return detalles; }
    public String getCliente() { return cliente; }
    
    public MetodoPagoDto(int id, String tipo, String detalles, String cliente) {
        this.id=id; this.tipo=tipo; this.detalles=detalles; this.cliente=cliente;
    }
   
}
