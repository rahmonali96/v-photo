package com.example.vphoto.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Path;

/**
 * Developed by Rahmonali Yoqubov
 * Email: rahmonaliyoqubov@gmail.com
 * Date: 15.09.2022
 * Project: vphoto
 */
@RestController
public class UploadController {
    @PostMapping
    public String upload(@RequestParam("file") MultipartFile file) {
        try {
            file.transferTo(Path.of(String.format("/home/products/%s", file.getOriginalFilename())));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return "Uploaded successfully!";
    }
}
