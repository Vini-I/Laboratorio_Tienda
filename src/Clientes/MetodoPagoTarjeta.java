package Clientes;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */




/**
 *
 * @author rodol
 */
public class MetodoPagoTarjeta  extends MetodoPago implements PayMethodStrategy<MetodoPagoTarjeta>  {

    public MetodoPagoTarjeta(int id, String detalles) {
        super(id, TipoMetodoPago.TARJETA, detalles);
    }

    @Override
    public MetodoPagoTarjeta create() {
        return new MetodoPagoTarjeta(this.getId(), this.getDetalles());
    }
    
}
