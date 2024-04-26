package com.example.Noticia.repository;

import com.example.Noticia.model.NoticiaEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface NoticiaRepository extends MongoRepository<NoticiaEntity, String>{

}