package com.examen.financiera.domain.dto;


import lombok.Data;

@Data
public class CustomerDTO {
    private Integer id;
    private String nombre;
    private String apellido;
    private String dni;
}
