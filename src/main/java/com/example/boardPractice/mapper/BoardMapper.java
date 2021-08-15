package com.example.boardPractice.mapper;

import com.example.boardPractice.domain.Board;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BoardMapper {

    int boardCount();

    List<Board> getList();
}
