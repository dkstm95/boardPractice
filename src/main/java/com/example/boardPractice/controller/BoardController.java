package com.example.boardPractice.controller;

import com.example.boardPractice.domain.Board;
import com.example.boardPractice.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/board/**")
@RequiredArgsConstructor
public class BoardController {

    private final BoardService service;

    @GetMapping("/hello")
    public String Hello() {
        return "/boards/hello";
    }

    @GetMapping("/test")
    public String test(Model model) {
        model.addAttribute("cnt", service.boardCount());
        model.addAttribute("test", service.boardList());

        return "/boards/hello";
    }

    @GetMapping("/main")
    public String main(Model model) {
        model.addAttribute("list", service.boardList());

        return "/boards/main";
    }

    @GetMapping("/view")
    public String viewBoard(Model model, Long boardId) {
        model.addAttribute("view", service.getBoard(boardId));

        return "/boards/view";
    }

    @GetMapping("/upload")
    public String uploadBoardForm() {
        return "/boards/upload";
    }

    @PostMapping("/upload")
    public String uploadBoardForm(Board board) {
        service.uploadBoard(board);
        return "redirect:/board/main";
    }

    @PutMapping("/update")
    public String updateBoardForm(Board board) {
        service.updateBoard(board);
        return "redirect:/board/main";
    }

    @DeleteMapping("/delete")
    public String deleteBoardForm(Long boardId) {
        service.deleteBoard(boardId);
        return "redirect:/board/main";
    }
}
