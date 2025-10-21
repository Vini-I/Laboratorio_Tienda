package Clientes;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author rodol
 */
public class MetodoPagoEfectivo extends MetodoPago {

    public MetodoPagoEfectivo(int id,  String detalles) {
        super(id, TipoMetodoPago.EFECTIVO, detalles);
    }
    
    
    
}
