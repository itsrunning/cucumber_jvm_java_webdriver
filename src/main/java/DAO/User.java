package DAO;

public class User {
    private final String name;
    private final Integer id;

    public User(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public User(String name) {
        this(null, name);
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

}
