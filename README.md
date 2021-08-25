# boardPractice
Spring Boot Practice by making simple board.
And I'm going to change MyBatis to a JPA.

## 참고 블로그
* https://tjdans.tistory.com/7?category=992472

## MySQL 가이드
* 설치
  - https://knowledgemarble.tistory.com/228
* 접속
  - https://knowledgemarble.tistory.com/229
* DB / 테이블 조회 및 생성
  - https://www.everdevel.com/MySQL/creating-table/
  - show databse; 가 아니라 show databases; 가 맞음
* ₩(backtick)vs '(single quote)
  - https://stackoverflow.com/questions/11321491/when-to-use-single-quotes-double-quotes-and-backticks-in-mysql

## Spring Boot 프로젝트
* 생성
  - start.spring.io 사용
  - Dependencies
    + Spring Web
    + Spring Boot DevTools
    + Lombok
    + Thymeleaf
    + H2 Database
    + MyBatis Framework 
  - ![start spring io_](https://user-images.githubusercontent.com/41232056/128606296-89d3dce3-bc8f-4f87-a70b-7e7f4939e052.png)

## Spring
* Annotation
  - @RequiredArgsConstructor ?
  - @Service, @Controller, @Repository 정확한 역할?
    + Controller -> Service -> Repository
  - @Transactional
  - @GetMapping(), @PostMapping(), @PutMapping(), @DeleteMapping()
* Model(org.springframework.ui.Model) 역할
  - HashMap 형태의 객체
  - View로 데이터를 넘겨줄 수 있게 하는 역할
  - Model.addAttribute("view에서 불러올 데이터의 값 == Key 값", "Key 값을 호출했을 때의 Value 값") 처럼 사용

## MyBatis
* Interface의 메소드 명 == xml의 id 명

## Thymeleaf
* [[${}]]
  - Model 객체에 있는 key를 불러오며 값을 출력하는 역할
* 문법 공식 doc
  - https://www.thymeleaf.org/doc/tutorials/3.0/usingthymeleaf.html#standard-expression-syntax

## Trouble Shooting
* compile() vs implementation 관련 글
  - https://bluayer.com/13
* @RequestMapping을 찾지 못하는 이슈
  - build.gradle에 implementation 'org.springframework.boot:spring-boot-starter-web' 추가
* 실행시 Process 'command '/Library/Java/JavaVirtualMachines/adoptopenjdk-11.jdk/Contents/Home/bin/java'' finished with non-zero exit value 1 에러 발생
  - Preferences > Gradle > Build and rung using / Run tests using > Gradle 대신 IntelliJ IDEA 선택
  - Preferences > Gradle > Gradle JVM 부분도 java 설치 경로 선택
* Deprecated Gradle features were used in this build, making it incompatible with Gradle 8.0. 워닝 메세지 출력 
  - https://sunghs.tistory.com/118

## ETC
* 마크다운 작성법
  - https://gist.github.com/ihoneymon/652be052a0727ad59601
* 크롬 스크롤 아래 화면 포함 캡처 방법
  - https://birdmoon.medium.com/%EA%B8%B4-%EC%8A%A4%ED%81%AC%EB%A1%A4-%EC%9B%B9%EC%82%AC%EC%9D%B4%ED%8A%B8-%ED%81%AC%EB%A1%AC%EC%97%90%EC%84%9C-%EA%B0%84%EB%8B%A8%ED%9E%88-%EC%BA%A1%EC%B3%90%ED%95%98%EA%B8%B0-26867b95819e
