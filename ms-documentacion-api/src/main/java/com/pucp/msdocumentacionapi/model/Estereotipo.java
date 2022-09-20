package com.pucp.msdocumentacionapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class Estereotipo {
    private int id;
    private String nombre;
    private String descripcion;
    private String fechaDefinicion;
    private String urlImagen;
}
