package com.example.boardPractice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.example.boardPractice")
public class BoardPracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(BoardPracticeApplication.class, args);
	}

}
