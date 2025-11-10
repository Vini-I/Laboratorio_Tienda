/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Catalogo;

import Catalogo.Producto.ProductBuilder;

/**
 *
 * @author rodol
 */
public class ProductoMapper {
      public ProductoDto toDto(Producto pro, String categoria) {
        return new ProductoDto(pro.getCodigo(),pro.getNombre(),pro.getPrecio(),pro.getStock(),categoria);
    }
    
    public Producto toEntity(ProductBuilder builder) {
        return builder.build();
    }
}
