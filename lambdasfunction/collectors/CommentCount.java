package lambdasfunction.collectors;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Comment{
    private String user;
    private String commentText;

    public Comment(String user, String commentText) {
        this.user = user;
        this.commentText = commentText;
    }
    public String getUser() {
        return user;
    }
    public String getCommentText() {
        return commentText;
    }
}
public class CommentCount {
    public static void main(String[] args) {
        List<Comment> comments = Arrays.asList(
                new Comment("user1", "Nice Post"),
                new Comment("user2", "Thanks for sharing"),
                new Comment("user1", "Great Article"),
                new Comment("user3", "Interesting read."),
                new Comment("user2", "I agree")
        );

        Map<String, Long> commentCountByUser = comments.stream()
                .collect(Collectors.groupingBy(
                        Comment::getUser,
                        Collectors.counting()
                ));

        System.out.println("Number of Comments: ");
        commentCountByUser.forEach((user, count) -> {
            System.out.println(user + ": " + count);
        });
    }
}
