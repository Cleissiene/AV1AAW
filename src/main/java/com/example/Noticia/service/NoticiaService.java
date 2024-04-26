package com.example.Noticia.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.example.Noticia.model.NoticiaEntity;
import com.example.Noticia.repository.NoticiaRepository;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
@Service
public class NoticiaService {

    private final String BASE_URL = "https://servicodados.ibge.gov.br/api/v3/noticias";

    private final RestTemplate restTemplate;

    public NoticiaService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public ResponseEntity<String> obterNoticiasEReleases() {
        return restTemplate.getForEntity(BASE_URL, String.class);
    }

    public ResponseEntity<String> obterApenasNoticias() {
        String url = BASE_URL + "/?tipo=noticia";
        return restTemplate.getForEntity(url, String.class);
    }

    public ResponseEntity<String> obterApenasReleases() {
        String url = BASE_URL + "/?tipo=release";
        return restTemplate.getForEntity(url, String.class);
    }
}