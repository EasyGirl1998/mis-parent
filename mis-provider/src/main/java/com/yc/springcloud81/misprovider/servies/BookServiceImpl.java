package com.yc.springcloud81.misprovider.servies;

import com.yc.springcloud81.misprovider.bean.Book;
import com.yc.springcloud81.misprovider.dao.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    @Autowired(required = false)
    private  BookMapper bm;

    @Override
    public Book getBook(Integer id) {
        return bm.selectByPrimaryKey(id);
    }
}
