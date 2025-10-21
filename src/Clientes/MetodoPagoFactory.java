/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clientes;

/**
 *
 * @author rodol
 */
public class MetodoPagoFactory {
    
    public static MetodoPago crearMetodoPago(TipoMetodoPago tipo, int id, String detalles){
        switch (tipo) {
            case TARJETA:
                return new MetodoPagoTarjeta(id, detalles);
            case TRANSFERENCIA:
                return new MetodoPagoTransferencia(id, detalles);
            case EFECTIVO:
                return new MetodoPagoEfectivo(id, detalles);
            default:
                throw new IllegalArgumentException("Tipo de método de pago desconocido: " + tipo);
        }
    }
    
}
