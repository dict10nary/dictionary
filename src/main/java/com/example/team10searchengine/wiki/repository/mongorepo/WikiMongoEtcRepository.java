package com.example.team10searchengine.wiki.repository.mongorepo;

import com.example.team10searchengine.wiki.entity.WikiMongoEtc;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface WikiMongoEtcRepository extends MongoRepository<WikiMongoEtc,String> {
    WikiMongoEtc findByKeyword(String keyword);
    List<WikiMongoEtc> findAllByOrderByCreatedAtDesc();
    Long countBy();
}
