package com.example.order.mapper;

import com.example.order.entity.Employee;
import org.apache.ibatis.annotations.Mapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;


/**
 * @author songyangyu
 * @version V1.0
 * @Package com.example.order.mapper
 * @date 2023/5/22 14:43
 */
@Mapper
public interface EmployeeMapper extends BaseMapper<Employee>{
}
