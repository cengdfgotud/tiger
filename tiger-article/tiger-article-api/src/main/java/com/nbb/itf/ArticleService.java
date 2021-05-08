package com.nbb.itf;

import com.nbb.bean.Article;

/**
 * Created by yuqi on 2017/5/10.
 */
public interface ArticleService {
    /**
     * 根据主键查询文章[集成测试]
     * @param id
     * @return
     */
    Article selectArticle(int id);
}
