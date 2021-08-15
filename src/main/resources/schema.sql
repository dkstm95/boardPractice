CREATE TABLE tbl_board (
    boardId Long auto_increment,
    title varchar(30) NOT NULL,
    content varchar(30) NOT NULL,
    name varchar(30) NOT NULL,
    primary key(boardId)
);

INSERT INTO tbl_board(title, content, name) VALUES
('타이틀', '컨텐트', '네임')