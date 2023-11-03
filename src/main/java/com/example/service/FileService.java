package com.example.service;

import com.example.result.Result;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface FileService {
    String test="asd";



    default void test() {
        System.out.println("asdf");
    }
    public Result addExcel(MultipartFile file) throws IOException;
}
