package com.example.team10searchengine.kordict.controller;

import com.example.team10searchengine.kordict.service.KorDictService;
import com.example.team10searchengine.shared.RankResponseDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
public class KorDictController {
    private final KorDictService korDictService;

    // service 단에서 sort
    @GetMapping("/search/kordict")
    public ResponseEntity<?> findByNgramParser(@RequestParam String keyword) {
        return korDictService.searchKorDictNgramSort(keyword);
    }

    @GetMapping("/search/kordict/ranking")
    public List<RankResponseDto> getKorDictRankList() {
        return korDictService.getKorDictRankList();
    }

}
