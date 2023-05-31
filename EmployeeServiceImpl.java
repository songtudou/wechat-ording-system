package com.example.order.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.order.entity.Employee;
import com.example.order.mapper.EmployeeMapper;
import com.example.order.service.EmployeeService;
import org.springframework.stereotype.Service;

/**
 * @author songyangyu
 * @version V1.0
 * @Package com.example.order.service.impl
 * @date 2023/5/22 14:48
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {
}
