package com.sparta.board.dto;

import com.sparta.board.entity.User;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class BoardSummaryDto {

    private Long id;
    private String title;
    private Long user_id;
    private String user_name;
    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;

    public BoardSummaryDto(Long id, String title, Long user_id,String user_name, LocalDateTime createdAt, LocalDateTime modifiedAt) {
        this.id = id;
        this.title = title;
        this.user_id = user_id;
        this.user_name = user_name;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
    }
}
