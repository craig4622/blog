package com.lagou.blog.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lagou.blog.pojo.TArticle;

import java.util.List;

/**
 * @ClassName BlogService
 * @Description TODO
 * @Author xsq
 * @Date 2020/4/21 9:57
 **/
public interface BlogService {

    List<TArticle> getBlogList();

    IPage<TArticle> getBlogListByPage(Page page);
}
