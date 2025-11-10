/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Facturacion;

import Clientes.Cliente;


/**
 *
 * @author rodol
 */
public class FacturaMapper {
     public FacturaDto toDto(Factura fac, String cliente) {
        return new FacturaDto(fac.getNumero(), cliente,fac.getFecha().toString(),fac.getEstado().toString());
    }
    
    public Factura toEntity(FacturaDto dto, Cliente cliente) {
        return new Factura(dto.getNumero(),cliente);
    }
}
