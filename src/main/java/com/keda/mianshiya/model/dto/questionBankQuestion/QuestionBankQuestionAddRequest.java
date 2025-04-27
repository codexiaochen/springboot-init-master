package com.keda.mianshiya.model.dto.questionBankQuestion;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 创建题库题目关联请求
 *
 * @author <a href="https://github.com/litest">chenqi</a>
 * @from <a href="https://www.code-nav.cn">test</a>
 */
@Data
public class QuestionBankQuestionAddRequest implements Serializable {

    /**
     * id
     */
    @TableId(type = IdType.ASSIGN_ID)
    private Long id;

    /**
     * 题库 id
     */
    private Long questionBankId;

    private static final long serialVersionUID = 1L;
}