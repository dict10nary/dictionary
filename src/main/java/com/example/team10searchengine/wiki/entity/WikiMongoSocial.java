package com.example.team10searchengine.wiki.entity;

import lombok.Getter;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.List;

@Document("wiki_social")
@Getter
public class WikiMongoSocial<T> {
    @Id
    private String _id;

    private String keyword;
    private List<T> data;
    private LocalDateTime createdAt;

    public WikiMongoSocial(String keyword, List<T> data, LocalDateTime createdAt) {
        this.keyword = keyword;
        this.data = data;
        this.createdAt = createdAt;

    }
}