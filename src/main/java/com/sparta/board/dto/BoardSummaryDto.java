package com.sparta.board.dto;

import com.sparta.board.entity.User;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class BoardSummaryDto {

    private Long id;
    private String title;
    private Long userId;
    private String userEmail;
    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;

    public BoardSummaryDto(Long id, String title, Long userId,String userName, LocalDateTime createdAt, LocalDateTime modifiedAt) {
        this.id = id;
        this.title = title;
        this.userId = userId;
        this.userEmail = userName;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
    }
}
