package ex01v2;

import ex01v2.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
public class ViewData1 {
    private int boardId;
    private String title;
    private String content;
    private User user;

    public ViewData1(DBData1 dbData) {
        this.boardId = dbData.getBoardId();
        this.title = dbData.getTitle();
        this.content = dbData.getContent();
        this.user = new User();
    }
}
