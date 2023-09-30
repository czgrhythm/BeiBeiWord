package com.shell.controller;

import com.shell.domain.entity.Word;
import com.shell.domain.vo.SentenceVo;
import com.shell.domain.vo.WordVo;
import com.shell.service.SentenceService;
import com.shell.service.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.spi.WebServiceFeatureAnnotation;
import java.util.List;

@RestController
@RequestMapping("words")
@CrossOrigin
public class WordController {

    @Autowired
    WordService wordService;
    @Autowired
    SentenceService sentenceService;
    @GetMapping("")
    public List<WordVo> getWordList(){
        return wordService.getWordList();
    }
    @GetMapping("sentence")
    public List<SentenceVo> getSV(){
        return sentenceService.getSentenceById(1);
    }
}
