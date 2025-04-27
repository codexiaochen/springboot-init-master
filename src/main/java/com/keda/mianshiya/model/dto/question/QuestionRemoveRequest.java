package com.keda.mianshiya.model.dto.question;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 创建题目请求
 *
 * @author <a href="https://github.com/litest">chenqi</a>
 * @from <a href="https://www.code-nav.cn">test</a>
 */
@Data
public class QuestionRemoveRequest implements Serializable {

    /**
     * 题目 id
     */
    private List<Long> questionId;

    private static final long serialVersionUID = 1L;
}