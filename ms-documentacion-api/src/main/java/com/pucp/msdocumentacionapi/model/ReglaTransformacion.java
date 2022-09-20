package com.pucp.msdocumentacionapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class ReglaTransformacion {
    private int id;
    private String nombre;
    private String descripcion;
    private String fechaDefinicion;
    private String urlImagen;
}
