package com.example.order.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.order.entity.Category;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author songyangyu
 * @version V1.0
 * @Package com.example.order.mapper
 * @date 2023/5/22 15:43
 */
@Mapper
public interface CategoryMapper extends BaseMapper<Category> {
}