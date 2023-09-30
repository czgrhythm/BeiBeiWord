package com.shell.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shell.domain.entity.Word;
import com.shell.domain.vo.WordVo;
import com.shell.mapper.WordMapper;
import com.shell.service.SentenceService;
import com.shell.service.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WordServiceImpl extends ServiceImpl<WordMapper, Word> implements WordService {

    @Autowired
    SentenceService sentenceService;
    @Override
    public List<WordVo> getWordList() {
        Page<Word> page = new Page<>(1, 8);
        page(page);
        List<Word> records = page.getRecords();

        ArrayList<WordVo> wordVoList = new ArrayList<>();
        for (Word word : records) {
            Long id = word.getId();
            WordVo wordVo = BeanUtil.copyProperties(word, WordVo.class);
            // 处理单词的翻译格式
            wordVo.setTranslations(word.getTranslation().split("//"));
            // 添加例句及其翻译
            wordVo.setEgs(sentenceService.getSentenceById(id));
            wordVoList.add(wordVo);
        }




        return wordVoList;
    }
}
