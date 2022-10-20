package com.example.vphoto.controller;

import com.example.vphoto.service.FileService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * Developed by Rahmonali Yoqubov
 * Email: rahmonaliyoqubov@gmail.com
 * Date: 15.09.2022
 * Project: vphoto
 */
@RestController
public class UploadController {
    private final FileService fileService;

    public UploadController(FileService fileService) {
        this.fileService = fileService;
    }

    @PostMapping("/products")
    public String uploadProductPhoto(@RequestParam("file") MultipartFile file) {
        fileService.uploadProductPhoto(file);
        return "Product photo uploaded successfully!";
    }

    @PostMapping("/clients")
    public String uploadClientPhoto(@RequestParam("file") MultipartFile file) {
        fileService.uploadClientPhoto(file);
        return "Client photo uploaded successfully!";
    }

    @PostMapping("/contracts")
    public String uploadContractPhoto(@RequestParam("file") MultipartFile file) {
        fileService.uploadContractPhoto(file);
        return "Contract uploaded successfully!";
    }
}
