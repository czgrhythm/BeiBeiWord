package com.shell.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shell.domain.entity.Word;
import com.shell.domain.vo.WordVo;

import java.util.List;

public interface WordService extends IService<Word> {
    List<WordVo> getWordList();
}
