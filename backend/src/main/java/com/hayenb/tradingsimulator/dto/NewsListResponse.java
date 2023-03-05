package com.hayenb.tradingsimulator.dto;

import com.hayenb.tradingsimulator.model.NewsArticle;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class NewsListResponse {
    private List<NewsArticle> articles;
}