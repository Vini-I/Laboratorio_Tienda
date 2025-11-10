/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Notificaciones;

import Facturacion.Factura;
import java.time.LocalDateTime;

/**
 *
 * @author jprod
 */
public class NotificacionDto {
    private final int id;
    private final int factura;
    private final String canal;
    private final String estado;
    private final String fecha;

    public int getId(){ return id; }
    public int getFactura(){ return factura; }
    public String getCanal(){ return canal; }
    public String getEstado(){ return estado; }
    public String getFecha(){ return fecha; }
    
    public NotificacionDto(int id, int factura, String canal, String notif, String fecha) {
        this.id=id; 
        this.factura=factura; 
        this.canal=canal;
        this.estado=notif; 
        this.fecha=fecha;
    }
    
}
