package com.acai.service;

import com.acai.domain.Book;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * DESC
 *
 * @author YangMingCai
 * @date 2023年03月08日 16:11
 */
@Transactional
public interface BookService {

    /**
     * 保存数据
     *
     * @param book
     * @return
     */
    public boolean save(Book book);


    /**
     * 保存数据
     *
     * @param book
     * @return
     */
    public boolean update(Book book);

    /**
     * 根据id删除
     *
     * @param id
     * @return
     */
    public boolean delete(Integer id);

    /**
     * 根据id删除
     *
     * @param id
     * @return
     */
    public Book getById(Integer id);


    public List<Book> getAll();
}
