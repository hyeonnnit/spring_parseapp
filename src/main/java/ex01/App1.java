package ex01;

import ex01.model.User;

import javax.swing.text.View;

public class App1 {
    public static void main(String[] args) {
        // 1. DB에서 가져온 데이터 - Flat(평평) 하게 가져올 수 밖에 없다
        DBData1 dbData = new DBData1(1, "제목1", "내용1", 3, "love", "love@nate.com");
        //DBData1는 db에서 조회한 데이터
        //ViewData1는 view 에 뿌리기 위해

        // 2. dbData1를 ViewData1에 옮기시오 - ORM

        //1. 세터로 하나씩 넣기
        ViewData1 v1 = new ViewData1();
        v1.setBoardId(dbData.getBoardId());
        v1.setTitle(dbData.getTitle());
        v1.setContent(dbData.getContent());

        User user = new User();
        user.setUserId(dbData.getUserId());
        user.setUsername(dbData.getUsername());
        user.setEmail(dbData.getEmail());

        v1.setUser(user);

        //2. 생성자 이용
        User user1 = new User(dbData.getUserId(), dbData.getUsername(), dbData.getEmail());
        ViewData1 v2  = new ViewData1(dbData.getBoardId(), dbData.getTitle(), dbData.getContent(),user);



    }
}