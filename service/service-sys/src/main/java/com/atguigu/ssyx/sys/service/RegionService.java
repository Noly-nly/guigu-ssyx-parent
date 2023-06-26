package com.atguigu.ssyx.sys.service;

import com.atguigu.ssyx.model.sys.Region;

import java.util.List;

public interface RegionService {
    //根据区域关键字查询区域列表信息
    List<Region> getRegionByKeyword(String keyword);
}
