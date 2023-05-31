package com.example.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.order.entity.Category;

/**
 * @author songyangyu
 * @version V1.0
 * @Package com.example.order.service
 * @date 2023/5/22 15:44
 */
public interface CategoryService extends IService<Category> {

    public void remove(Long id);

}