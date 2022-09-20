package com.pucp.msdocumentacionapi.service;

import com.pucp.msdocumentacionapi.model.Estereotipo;
import com.pucp.msdocumentacionapi.model.Noticia;
import com.pucp.msdocumentacionapi.model.ReglaTransformacion;

import java.util.List;

public interface DocumentacionService {
    List<ReglaTransformacion> getReglas();
    List<Estereotipo> getEstereotipos();
    List<Noticia> getNoticias();
}
