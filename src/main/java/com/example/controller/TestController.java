package com.example.controller;


import com.example.bean.mapper.StudentMapper;
import com.example.bean.pojo.StudentExample;
import com.example.common.enums.ApiResult;
import com.example.result.Result;
import com.example.service.impl.FileServiceimpl;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

@RestController
public class TestController {
    @Resource
    StudentMapper mapper;
    @Resource
    FileServiceimpl serviceimpl;
    @RequestMapping("/test")
    public Result test(){
        StudentExample example=new StudentExample();
        StudentExample.Criteria r1=example.or().andNameEqualTo("小卡");
        StudentExample.Criteria r2=example.or().andNameEqualTo("小明");
        System.out.println(mapper.selectByExample(example));
//          serviceimpl.test();
        System.out.println("scfbdff");
        System.out.println(ApiResult.TEST);
        System.out.println(12345);
        return Result.success("sd");
    }
    @RequestMapping("/test2")
    public Result test2(String name){
        StudentExample example=new StudentExample();
        StudentExample.Criteria r1=example.or().andNameEqualTo("小卡");
        StudentExample.Criteria r2=example.or().andNameEqualTo("小明");
        System.out.println(mapper.selectByExample(example));
        System.out.println(ApiResult.TEST);
        return Result.success("sd");
    }
    @PostMapping("/file")
    public Result addFile(@PathVariable("file") MultipartFile file) throws IOException {
        return serviceimpl.addExcel(file);
    }
    @RequestMapping("/test01")
    public String test01(){
         return "";
    }


}
