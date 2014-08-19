package DAO;

import org.skife.jdbi.v2.sqlobject.*;

import java.util.List;

public interface MicroBlogDao {
    @SqlUpdate("insert into \"microBlogs\" (\"userId\", content) values (:userId, :content)")
    @GetGeneratedKeys
    int create(@BindBean MicroBlog microBlog);

    @SqlUpdate("delete from \"microBlogs\"")
    void deleteAll();

    void close();
}
