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
    private PayMethodStrategy strategy;
    
    public MetodoPago crearMetodoPago(PayMethodStrategy strategy){
        if (strategy == null) {
            throw new NullPointerException();
        }
        return strategy.create();
    }
    
}
