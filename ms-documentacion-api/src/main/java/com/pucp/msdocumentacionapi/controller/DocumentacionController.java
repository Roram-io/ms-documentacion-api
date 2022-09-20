package com.pucp.msdocumentacionapi.controller;

import com.pucp.msdocumentacionapi.model.Estereotipo;
import com.pucp.msdocumentacionapi.model.Noticia;
import com.pucp.msdocumentacionapi.model.ReglaTransformacion;
import com.pucp.msdocumentacionapi.service.DocumentacionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/documentacion")
public class DocumentacionController {

    private final DocumentacionService documentacionService;

    public DocumentacionController(DocumentacionService documentacionService){
        this.documentacionService = documentacionService;
    }

    @GetMapping("/reglas/listar")
    public List<ReglaTransformacion> getReglas(){
       return documentacionService.getReglas();
    }

    @GetMapping("/estereotipos/listar")
    public List<Estereotipo> getEstereotipos(){
        return documentacionService.getEstereotipos();
    }

    @GetMapping("/noticias/listar")
    public List<Noticia> getNoticias(){
        return documentacionService.getNoticias();
    }

}
