package com.atguigu.ssyx.sys.service.impl;

import com.atguigu.ssyx.model.sys.Ware;
import com.atguigu.ssyx.sys.mapper.WareMapper;
import com.atguigu.ssyx.sys.service.WareService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WareServiceImpl extends ServiceImpl<WareMapper, Ware> implements WareService {


    @Override
    public List<Ware> list() {
        return super.list();
    }
}
