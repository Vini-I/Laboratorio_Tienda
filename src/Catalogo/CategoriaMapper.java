/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Catalogo;

/**
 *
 * @author autoa
 */
public class CategoriaMapper {
    public CategoriaDto toDto(Categoria cat) {
        return new CategoriaDto(cat.getId(), cat.getNombre(), cat.getDescripcion(), cat.isActiva());
    }
    
    public Categoria toDto(CategoriaDto dto) {
        //Ocupa traer datos de la base de datos
        return new Categoria(dto.getId(), dto.getNombre(), dto.getDescripcion(), dto.isActiva());
    }
}
