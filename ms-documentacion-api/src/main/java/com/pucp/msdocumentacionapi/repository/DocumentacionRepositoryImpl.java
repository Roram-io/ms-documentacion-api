package com.pucp.msdocumentacionapi.repository;

import com.pucp.msdocumentacionapi.model.Estereotipo;
import com.pucp.msdocumentacionapi.model.Noticia;
import com.pucp.msdocumentacionapi.model.ReglaTransformacion;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Slf4j
public class DocumentacionRepositoryImpl implements DocumentacionRepository{
    @Override
    public List<ReglaTransformacion> getReglas() {
        return null;
    }

    @Override
    public List<Estereotipo> getEstereotipos() {
        return null;
    }

    @Override
    public List<Noticia> getNoticias() {
        return null;
    }
}
