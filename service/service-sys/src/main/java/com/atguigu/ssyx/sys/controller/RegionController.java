package com.atguigu.ssyx.sys.controller;

import com.atguigu.ssyx.common.result.Result;
import com.atguigu.ssyx.model.sys.Region;
import com.atguigu.ssyx.sys.service.RegionService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "区域接口")
@RestController
@RequestMapping("/admin/sys/region")
//@CrossOrigin
public class RegionController {

    @Autowired
    private RegionService regionService;

    //根据区域关键字查询区域列表信息
    //    url: `${api_name}/findRegionByKeyword/${keyword}`,
    //    method: 'get'
    @ApiOperation("根据区域关键字查询区域列表信息")
    @GetMapping("findRegionByKeyword/{keyword}")
    public Result findRegionByKeyword(@PathVariable("keyword") String keyword) {
        List<Region> list = regionService.getRegionByKeyword(keyword);
        return Result.ok(list);
    }
}
