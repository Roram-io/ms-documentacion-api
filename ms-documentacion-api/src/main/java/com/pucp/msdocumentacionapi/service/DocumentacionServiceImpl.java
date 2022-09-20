package com.pucp.msdocumentacionapi.service;

import com.pucp.msdocumentacionapi.model.Estereotipo;
import com.pucp.msdocumentacionapi.model.Noticia;
import com.pucp.msdocumentacionapi.model.ReglaTransformacion;
import com.pucp.msdocumentacionapi.repository.DocumentacionRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class DocumentacionServiceImpl implements DocumentacionService{

    private DocumentacionRepository documentacionRepository;

    public DocumentacionServiceImpl(DocumentacionRepository documentacionRepository){
        this.documentacionRepository = documentacionRepository;
    }
    @Override
    public List<ReglaTransformacion> getReglas() {
        return documentacionRepository.getReglas();
    }

    @Override
    public List<Estereotipo> getEstereotipos() {
        return documentacionRepository.getEstereotipos();
    }

    @Override
    public List<Noticia> getNoticias() {
        return documentacionRepository.getNoticias();
    }
}
