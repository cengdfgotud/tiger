package com.nbb.service;

import com.nbb.bean.Article;
import com.nbb.dao.ArticleMapper;
import com.nbb.itf.ArticleService;
import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by yuqi on 2017/5/10.
 */
@Log4j
@Service
public class ArticleServiceImpl  implements ArticleService {

    @Resource
    private ArticleMapper articleMapper;

    @Override
    public Article selectArticle(int id) {
        log.info("id==="+id);
        return articleMapper.selectByPrimaryKey(id);
    }
}
