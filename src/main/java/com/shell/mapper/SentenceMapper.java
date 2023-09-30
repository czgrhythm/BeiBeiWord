package com.shell.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.shell.domain.entity.Sentence;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface SentenceMapper extends BaseMapper<Sentence> {
    @Select("select *\n" +
            "from word_sentence ws\n" +
            "    join sentence s on s.id = ws.sentence_id\n" +
            "where ws.word_id= #{id}")
    List<Sentence> getSentenceById(long id);

}
