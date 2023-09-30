package com.shell.domain.vo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.shell.domain.entity.Sentence;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WordVo {
    private Long id;
    private String word;
    private String[] translations;
    private List<SentenceVo> egs;
    private Boolean isLearned = false;
    private Boolean isKnown = false;

}
