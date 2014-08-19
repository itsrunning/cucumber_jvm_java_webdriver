package DAO;


public class MicroBlog {
    private final Integer id;
    private final int userId;
    private final String content;

    public MicroBlog(Integer id, int userId, String content) {
        this.id = id;
        this.userId = userId;
        this.content = content;
    }

    public MicroBlog(int userId, String content) {
        this(null, userId, content);
    }

    public int getUserId() {
        return userId;
    }

    public String getContent() {
        return content;
    }

    public Integer getId() {
        return id;
    }

}
