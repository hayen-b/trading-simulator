package com.hayenb.tradingsimulator.mapper;

import com.hayenb.tradingsimulator.model.NewsArticle;
import com.hayenb.tradingsimulator.model.NewsArticleComment;
import com.hayenb.tradingsimulator.model.User;
import com.hayenb.tradingsimulator.dto.NewsArticleCommentDto;
import com.hayenb.tradingsimulator.dto.NewsArticleDto;

import java.util.ArrayList;
import java.util.List;

public class NewsArticleMapper {
    public static NewsArticleDto convertToDto(NewsArticle article, User user) {
        NewsArticleDto dto = new NewsArticleDto();
        dto.setId(article.getId());
        dto.setAuthor(article.getAuthor());
        dto.setTitle(article.getTitle());
        dto.setDescription(article.getDescription());
        dto.setUrl(article.getUrl());
        dto.setUrlToImage(article.getUrlToImage());
        dto.setPublishedAt(article.getPublishedAt());
        dto.setLikeCount(article.getNumberOfLikes());
        dto.setLiked(user.hasLikedArticle(article));
        dto.setComments(convertCommentsToDto(article.getComments()));
        return dto;
    }

    public static NewsArticleCommentDto convertCommentToDto(NewsArticleComment comment) {
        NewsArticleCommentDto dto = new NewsArticleCommentDto();
        dto.setAuthor(comment.getUser().getFirstName() + " " + comment.getUser().getLastName());
        dto.setContent(comment.getContent());
        dto.setPostedDateTime(comment.getPostedDateTime());
        return dto;
    }

    public static List<NewsArticleCommentDto> convertCommentsToDto(List<NewsArticleComment> comments) {
        List<NewsArticleCommentDto> dtos = new ArrayList<>();
        for (NewsArticleComment comment : comments) {
            dtos.add(convertCommentToDto(comment));
        }
        return dtos;
    }
}