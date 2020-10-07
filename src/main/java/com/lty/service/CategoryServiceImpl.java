package com.lty.service;

import com.lty.dao.CategoryMapper;
import com.lty.pojo.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryMapper CategoryMapper;

    @Override
    public List<Category> getAllCategory() {
        return CategoryMapper.getAllCategory();
}

    public void setCategoryMapper(CategoryMapper categoryMapper) {
        this.CategoryMapper = categoryMapper;
    }
}
