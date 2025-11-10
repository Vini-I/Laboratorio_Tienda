/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Notificaciones;

import Facturacion.Factura;

/**
 *
 * @author rodol
 */
public class NotificacionMapper {
    public NotificacionDto toDto(Notificacion not, int factura, String canal) {
        return new NotificacionDto(not.getId(),factura,canal,not.getEstado().toString(),not.getFecha().toString());
    }
    
    public Notificacion toEntity(NotificacionDto dto, Factura factura, CanalNotificacion canal) {
        return new Notificacion(dto.getId(),factura,canal);
    }
}
