package com.shell.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shell.domain.entity.Sentence;
import com.shell.domain.vo.SentenceVo;

import java.util.List;

public interface SentenceService extends IService<Sentence> {
    List<SentenceVo> getSentenceById(long id);
}
