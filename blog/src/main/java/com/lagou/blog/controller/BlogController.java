package com.lagou.blog.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lagou.blog.pojo.TArticle;
import com.lagou.blog.service.BlogService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @ClassName BlogController
 * @Description TODO
 * @Author xsq
 * @Date 2020/4/21 9:57
 **/
@Slf4j
@Controller
@RequestMapping("blog")
public class BlogController {

    @Autowired
    private BlogService blogService;

    @RequestMapping("/getBlogList")
    @ResponseBody
    public List<TArticle> getBlogList() {
        log.info("查询所有的博客文章");
        return blogService.getBlogList();
    }

    @RequestMapping("/getBlogListByPage")
    public String getBlogListByPage(Page page, Model model) {
        log.info("查询所有的博客文章");
        IPage<TArticle> blogListByPage = blogService.getBlogListByPage(page);
        model.addAttribute("tArticleList", blogListByPage);
        return "client/index";
    }

}
