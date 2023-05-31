package com.example.order.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.order.entity.Dish;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author songyangyu
 * @version V1.0
 * @Package com.example.order.mapper
 * @date 2023/5/29 11:20
 */
@Mapper
public interface DishMapper extends BaseMapper<Dish> {
}

