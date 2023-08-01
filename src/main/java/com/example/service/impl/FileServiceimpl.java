package com.example.service.impl;

import com.example.result.Result;
import com.example.service.FileService;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

@Service
public class FileServiceimpl implements FileService {
    @Override
    public Result addExcel(MultipartFile file) throws IOException {
        InputStream in = null;
        try {
            in =file.getInputStream();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        XSSFWorkbook sheets=new XSSFWorkbook(in);
        System.out.println(sheets);
        XSSFSheet xssfSheet=sheets.getSheetAt(0);
        XSSFRow titleRow=xssfSheet.getRow(0);
        File file1=new File("d://fileTest");
        if (file1.exists()){
            file1.mkdir();
        }
        String filename=file.getOriginalFilename();

        return null;
    }
}
