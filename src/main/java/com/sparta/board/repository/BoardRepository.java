package com.sparta.board.repository;

import com.sparta.board.dto.BoardSummaryDto;
import com.sparta.board.entity.Board;
import com.sparta.board.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BoardRepository extends JpaRepository<Board, Long> {
    List<Board> findAllByOrderByModifiedAtDesc();
    Optional<Board> findByIdAndUser(Long id, User user);
    @Query(value="select new com.sparta.board.dto.BoardSummaryDto(board.id, board.title, board.user.id,board.user.username" +
            ",board.createdAt, board.modifiedAt) from Board board")
    List<BoardSummaryDto> findAllBoardsSummary();

    void deleteAllByUser(User user);
}
