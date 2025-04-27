package com.keda.mianshiya.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.keda.mianshiya.model.dto.questionBankQuestion.QuestionBankQuestionQueryRequest;
import com.keda.mianshiya.model.entity.QuestionBankQuestion;
import com.keda.mianshiya.model.entity.User;
import com.keda.mianshiya.model.vo.QuestionBankQuestionVO;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 题库题目关联服务
 *
 * @author <a href="https://github.com/litest">chenqi</a>
 * @from <a href="https://www.code-nav.cn">test</a>
 */
public interface QuestionBankQuestionService extends IService<QuestionBankQuestion> {

    /**
     * 校验数据
     *
     * @param questionBankQuestion
     * @param add 对创建的数据进行校验
     */
    void validQuestionBankQuestion(QuestionBankQuestion questionBankQuestion, boolean add);

    /**
     * 获取查询条件
     *
     * @param questionBankQuestionQueryRequest
     * @return
     */
    QueryWrapper<QuestionBankQuestion> getQueryWrapper(QuestionBankQuestionQueryRequest questionBankQuestionQueryRequest);
    
    /**
     * 获取题库题目关联封装
     *
     * @param questionBankQuestion
     * @param request
     * @return
     */
    QuestionBankQuestionVO getQuestionBankQuestionVO(QuestionBankQuestion questionBankQuestion, HttpServletRequest request);

    /**
     * 分页获取题库题目关联封装
     *
     * @param questionBankQuestionPage
     * @param request
     * @return
     */
    Page<QuestionBankQuestionVO> getQuestionBankQuestionVOPage(Page<QuestionBankQuestion> questionBankQuestionPage, HttpServletRequest request);

    /**
     * 批量向题库插入题目
     * @param questionIdList
     * @param questionBankId
     */
    void batchAddQuestionsToBank(List<Long> questionIdList, long questionBankId, User loginUser);

    /**
     * 批量向题库插入题目
     * @param questionBankQuestions
     */
    @Transactional(rollbackFor = Exception.class)
    void batchAddQuestionsToBankInner(List<QuestionBankQuestion> questionBankQuestions);

    /**
     * 批量从题库删除题目
     * @param questionIdList
     * @param questionBankId
     */

    void batchRemoveQuestionsFromBank(List<Long> questionIdList, Long questionBankId);
}



