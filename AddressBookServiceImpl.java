package com.example.order.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.order.entity.AddressBook;
import com.example.order.mapper.AddressBookMapper;

import com.example.order.service.AddressBookService;
import org.springframework.stereotype.Service;
/**
 * @author songyangyu
 * @version V1.0
 * @Package com.example.order.service.impl
 * @date 2023/5/29 21:56
 */
@Service
public class AddressBookServiceImpl extends ServiceImpl<AddressBookMapper, AddressBook> implements AddressBookService {

}
