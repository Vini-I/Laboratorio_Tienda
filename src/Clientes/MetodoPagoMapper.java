    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clientes;

/**
 *
 * @author autoa
 */
public class MetodoPagoMapper {
    public MetodoPagoDto toDto(MetodoPago mp, String cliente) {
        return new MetodoPagoDto(mp.getId(), getString(mp.getTipo()), mp.getDetalles(), cliente);
    }
    
    public MetodoPago toEntity(MetodoPagoDto dto) {
        return new MetodoPago(dto.getId(), getEnum(dto.getTipo()), dto.getDetalles());
    }
    
    private TipoMetodoPago getEnum(String dto) {
        if (dto.equalsIgnoreCase("tarjeta")) {
            return TipoMetodoPago.TARJETA;
        } 
        else if (dto.equalsIgnoreCase("efectivo")) {
            return TipoMetodoPago.EFECTIVO;
        }
        else{
            return TipoMetodoPago.TRANSFERENCIA;
        }
    }
    
    private String getString(TipoMetodoPago tipo) {
        if (tipo == TipoMetodoPago.TARJETA) {
            return "tarjeta";
        } 
        else if (tipo == TipoMetodoPago.EFECTIVO) {
            return "efectivo";
        } 
        else{
            return "transferencia";
        }
    }
}
