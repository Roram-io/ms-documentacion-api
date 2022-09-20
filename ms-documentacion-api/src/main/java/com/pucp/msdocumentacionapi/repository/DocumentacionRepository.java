package com.pucp.msdocumentacionapi.repository;

import com.pucp.msdocumentacionapi.model.Estereotipo;
import com.pucp.msdocumentacionapi.model.Noticia;
import com.pucp.msdocumentacionapi.model.ReglaTransformacion;

import java.util.List;

public interface DocumentacionRepository {
    List<ReglaTransformacion> getReglas();
    List<Estereotipo> getEstereotipos();
    List<Noticia> getNoticias();

}
