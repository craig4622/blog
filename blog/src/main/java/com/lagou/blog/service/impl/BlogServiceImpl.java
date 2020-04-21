package com.lagou.blog.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lagou.blog.dao.BlogMapper;
import com.lagou.blog.pojo.TArticle;
import com.lagou.blog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.transform.Result;
import java.util.List;

/**
 * @ClassName BlogServiceImpl
 * @Description TODO
 * @Author xsq
 * @Date 2020/4/21 9:57
 **/
@Service
public class BlogServiceImpl implements BlogService {

    @Autowired
    private BlogMapper blogMapper;

    @Override
    public List<TArticle> getBlogList() {
        return blogMapper.selectList(null);
    }

    @Override
    public IPage<TArticle> getBlogListByPage(Page page) {
        return blogMapper.selectPage(page, null);
    }
}
