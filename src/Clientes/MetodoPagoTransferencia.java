/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clientes;

/**
 *
 * @author rodol
 */
public class MetodoPagoTransferencia extends MetodoPago implements PayMethodStrategy<MetodoPagoTransferencia> {

    public MetodoPagoTransferencia(int id, String detalles) {
        super(id, TipoMetodoPago.TRANSFERENCIA, detalles);
    }

    @Override
    public MetodoPagoTransferencia create() {
        return new MetodoPagoTransferencia(this.getId(), this.getDetalles());
    }
    
    
}
