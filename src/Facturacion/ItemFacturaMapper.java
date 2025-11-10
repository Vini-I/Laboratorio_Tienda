/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Facturacion;

import Catalogo.Producto;

/**
 *
 * @author rodol
 */
public class ItemFacturaMapper {
    
     public ItemFacturaDto toDto(ItemFactura fac, String producto) {
        return new ItemFacturaDto(producto,fac.getCantidad(),fac.getPrecioUnitario());
    }
    
    public ItemFactura toEntity(ItemFacturaDto dto, Producto producto) {
        return new ItemFactura(producto,dto.getCantidad());
    }
}
