package DAO;

import org.skife.jdbi.v2.sqlobject.*;

import java.util.List;

public interface UserDao {

    @SqlUpdate("insert into users (name) values (:name)")
    Integer create(@BindBean User user);

    @SqlQuery("select * from users where name = :name")
    User findByName(@Bind("name") String name);

    @SqlQuery("select * from users")
    List<User> findAll();

    @SqlUpdate("delete from users")
    void deleteAll();

    void close();
}
