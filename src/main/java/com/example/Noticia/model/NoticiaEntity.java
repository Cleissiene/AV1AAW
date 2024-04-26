package com.example.Noticia.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "bd-noticia")
public class NoticiaEntity {

    @Id
    private String id;
    private String tipo;
    private String titulo;


    public NoticiaEntity(String id, String tipo, String titulo) {
        this.id = id;
        this.tipo = tipo;
        this.titulo = titulo;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // Construtor vazio
    public NoticiaEntity() {

    }
}
