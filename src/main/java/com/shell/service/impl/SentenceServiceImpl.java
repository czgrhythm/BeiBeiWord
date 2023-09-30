package com.shell.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shell.domain.entity.Sentence;
import com.shell.domain.vo.SentenceVo;
import com.shell.mapper.SentenceMapper;
import com.shell.service.SentenceService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SentenceServiceImpl extends ServiceImpl<SentenceMapper, Sentence> implements SentenceService {

    @Override
    public List<SentenceVo> getSentenceById(long id) {
        SentenceMapper baseMapper = getBaseMapper();
        List<Sentence> sentence = baseMapper.getSentenceById(id);
        List<SentenceVo> collect = sentence.stream()
                .map(s -> BeanUtil.copyProperties(s, SentenceVo.class))
                .collect(Collectors.toList());

        return collect;
    }
}
