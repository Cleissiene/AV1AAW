package com.example.Noticia.controller;

import com.example.Noticia.service.NoticiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/noticia")
public class NoticiaController {

    @Autowired
    private NoticiaService noticiaService;

    @GetMapping("/noticiasereleases")
    public ResponseEntity<String> obterNoticiasEReleases() {
        return noticiaService.obterNoticiasEReleases();
    }

    @GetMapping("/noticias")
    public ResponseEntity<String> obterApenasNoticias() {
        return noticiaService.obterApenasNoticias();
    }

    @GetMapping("/releases")
    public ResponseEntity<String> obterApenasReleases() {
        return noticiaService.obterApenasReleases();
    }

}