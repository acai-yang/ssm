package com.acai.service.impl;

import com.acai.controller.Code;
import com.acai.dao.BookDao;
import com.acai.domain.Book;
import com.acai.exception.BusinessException;
import com.acai.exception.SystemException;
import com.acai.service.BookService;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * DESC
 *
 * @author YangMingCai
 * @date 2023年03月08日 16:23
 */

@Service
public class BookServiceImpl implements BookService {


    @Autowired
    private BookDao bookDao;

    @Override
    public boolean save(Book book) {
        return bookDao.save(book) > 0;

    }

    @Override
    public boolean update(Book book) {
        return bookDao.update(book) > 0;
    }

    @Override
    public boolean delete(Integer id) {
        return bookDao.delete(id) > 0;
    }

    @Override
    public Book getById(Integer id) {
        if (id <= 0) {
            throw new BusinessException(Code.BUSINESS_ERR, "输入不规范");
        }

      /*  try {

        } catch (Exception e) {
            throw new SystemException(Code.SYSTEM_TIMEOUT_ERR, "服务器访问超时！");
        }*/
        return bookDao.getById(id);
    }

    @Override
    public List<Book> getAll() {
        return bookDao.getAll();
    }

}
