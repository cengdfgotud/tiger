package com.nbb.itf.remote;

import com.nbb.bean.Article;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by yuqi on 2017/5/23.
 */
@Path("/articleRemote")
public interface ArticleRemoteService {

    /**
     * 根据文章id获取文章标题【中文会有乱码 未解决】
     */
    @GET
    @Path("/getArticleTitleById")
    public String getArticleTitleById(@QueryParam("id") int id);


    /**
     * 获取所有文章列表
     */
    @GET
    @Path("/getAllArticleList")
    @Produces({ MediaType.APPLICATION_JSON })
    public Object getAllArticleList();

    /**
     * 根据id获取单个文章内容
     */
    @GET
    @Path("/getArticleById")
    @Produces({ MediaType.APPLICATION_JSON })
    public Object getArticleById(@QueryParam("id") int id);

}
