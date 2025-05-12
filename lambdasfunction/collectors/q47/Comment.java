package lambdasfunction.collectors.q47;

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
