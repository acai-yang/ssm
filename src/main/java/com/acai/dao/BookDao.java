package com.acai.dao;

import com.acai.domain.Book;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * DESC
 *
 * @author YangMingCai
 * @date 2023年03月08日 16:10
 */
public interface BookDao {

    @Insert("insert into tbl_book values(null,#{type},#{name},#{description})")
        //@Insert("insert into tbl_book(type,name,description) values(#{type},#{name},#{description})")
    void save(Book book);

    @Update("update tbl_book set type=#{type},name=#{name},description=#{description} where id=#{id}")
    void update(Book book);

    @Delete("delete from tbl_book where id=#{id}")
    void delete(Integer id);

    @Select("select * from tbl_book where id=#{id}")
    Book getById(Integer id);

    @Select("select * from tbl_book")
    List<Book> getAll();
}
