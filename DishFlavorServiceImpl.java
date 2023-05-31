package com.example.order.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.order.entity.DishFlavor;
import com.example.order.service.DishFlavorService;
import com.example.order.mapper.DishFlavorMapper;
import org.springframework.stereotype.Service;

/**
 * @author songyangyu
 * @version V1.0
 * @Package com.example.order.service.impl
 * @date 2023/5/29 22:19
 */
@Service
public class DishFlavorServiceImpl extends ServiceImpl<DishFlavorMapper,DishFlavor> implements DishFlavorService {
}