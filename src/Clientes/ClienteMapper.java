/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clientes;

/**
 *
 * @author autoa
 */
public class ClienteMapper {
    public ClienteDto toDto(Cliente cliente) {
        return new ClienteDto(cliente.getId(), cliente.getNombre(), cliente.getEmail(), cliente.getTelefono());
    }
    
    public Cliente toEntity(ClienteDto dto) {
        //falta traer metodos de pago de la base de datos
        return new Cliente(dto.getId(), dto.getNombre(), dto.getEmail(), dto.getTelefono());
    }
}
