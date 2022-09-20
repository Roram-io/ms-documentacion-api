package com.pucp.msdocumentacionapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Setter
@Getter
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class Noticia {
    private int id;
    private Date fechaPublicacion;
    private String descripcion;
    private String autor;
}
