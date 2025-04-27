package com.keda.mianshiya.esdao;

import com.keda.mianshiya.model.dto.post.PostEsDTO;
import com.keda.mianshiya.model.dto.question.QuestionEsDTO;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

/**
 * 帖子 ES 操作
 *
 * @author <a href="https://github.com/litest">chenqi</a>
 * @from <a href="https://test.icu">test</a>
 */
public interface QuestionEsDao extends ElasticsearchRepository<QuestionEsDTO, Long> {

    /**
     * 根据用户 id 查询
     * @param userId
     * @return
     */
    List<QuestionEsDTO> findByUserId(Long userId);

}