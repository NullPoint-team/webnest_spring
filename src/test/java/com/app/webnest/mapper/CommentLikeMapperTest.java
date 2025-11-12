package com.app.webnest.mapper;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
class CommentLikeMapperTest {
    @Autowired
    CommentLikeMapper commentLikeMapper;

    @Test
    void selectByPostId() {
        commentLikeMapper.selectByPostIdcount(1L);
        Long commentId = 1L;



        // 만약 기존 메서드명이 selectByPostIdcount 라면 ↓ 요 줄로 바꾸세요
         long cnt = commentLikeMapper.selectByPostIdcount(commentId);

        log.info("commentId={} 의 좋아요 개수 = {}", commentId, cnt);

        // 선택: 간단 검증
        // assertTrue(cnt >= 0);
    }
}