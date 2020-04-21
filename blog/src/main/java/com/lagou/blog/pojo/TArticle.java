package com.lagou.blog.pojo;

import lombok.Getter;
import lombok.Setter;

/**
 * @ClassName TArticle
 * @Description TODO
 * @Author xsq
 * @Date 2020/4/21 10:09
 **/
@Setter
@Getter
public class TArticle {

    private Integer id;

    private String title;

    private String content;

    private String created;

    private String modified;

    private String categories;

    private String tags;

    private Integer allowComment;

    private String thumbnail;
}
