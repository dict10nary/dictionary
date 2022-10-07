package com.example.team10searchengine.entity.kordict;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class KorDictPrimary implements Serializable {
    @Column(name = "word")
    private String word;
    @Column(name = "id")
    private Long id;
}
