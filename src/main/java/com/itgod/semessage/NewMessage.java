package com.itgod.semessage;

import com.itgod.model.Article;

import java.util.List;

/**
 * 文本消息
 * Created by Administrator on 2017/6/29.
 */
public class NewMessage extends BaseMessage {
    //图文消息个数，限制为10条以内
    private int ArticleCount;
    //多条图文消息信息，默认第一个item为大图
    private List<Article> Articles;

    public int getArticleCount() {
        return ArticleCount;
    }

    public void setArticleCount(int articleCount) {
        ArticleCount = articleCount;
    }

    public List<Article> getArticles() {
        return Articles;
    }

    public void setArticles(List<Article> articles) {
        Articles = articles;
    }
}
