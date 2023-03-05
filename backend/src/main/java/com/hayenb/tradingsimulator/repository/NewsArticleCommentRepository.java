package com.hayenb.tradingsimulator.repository;

import com.hayenb.tradingsimulator.model.NewsArticleComment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewsArticleCommentRepository extends JpaRepository<NewsArticleComment, Long> {
}
