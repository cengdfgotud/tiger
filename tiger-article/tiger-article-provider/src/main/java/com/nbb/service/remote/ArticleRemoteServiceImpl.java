package com.nbb.service.remote;

import com.nbb.bean.Article;
import com.nbb.dao.ArticleMapper;
import com.nbb.itf.remote.ArticleRemoteService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by yuqi on 2017/5/23.
 */
@Service
public class ArticleRemoteServiceImpl implements ArticleRemoteService {

    @Resource
    private ArticleMapper articleMapper;


    @Override
    public String getArticleTitleById(int id) {

        Article article = articleMapper.selectByPrimaryKey(id);
        if(article!=null){
            return  article.getTitle();
        }
        return "";
    }

    @Override
    public Object getAllArticleList() {
        return articleMapper.selectAll();
    }

    @Override
    public Object getArticleById(int id) {
        return articleMapper.selectByPrimaryKey(id);
    }
}
