package com.example.team10searchengine.kordict.entity;

import com.example.team10searchengine.kordict.dto.KorDictSortResDto;
import lombok.Getter;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.List;

@Document("kordict_sort")
@Getter
public class KorDictMongo{
    @Id
    private String _id;

    private String keyword;
    private List<KorDictSortResDto> data;
    private LocalDateTime createdAt;

    public KorDictMongo(String keyword, List<KorDictSortResDto> data, LocalDateTime createdAt) {
        this.keyword = keyword;
        this.data = data;
        this.createdAt = createdAt;

    }

}
