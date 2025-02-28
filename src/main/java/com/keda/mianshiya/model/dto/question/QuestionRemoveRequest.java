package com.keda.mianshiya.model.dto.question;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 创建题目请求
 *
 * @author <a href="https://github.com/liyupi">程序员鱼皮</a>
 * @from <a href="https://www.code-nav.cn">编程导航学习圈</a>
 */
@Data
public class QuestionRemoveRequest implements Serializable {

    /**
     * 题目 id
     */
    private List<Long> questionId;

    private static final long serialVersionUID = 1L;
}