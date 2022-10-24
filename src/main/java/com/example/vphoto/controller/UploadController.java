package com.example.vphoto.controller;

import com.example.vphoto.dto.ApiResponse;
import com.example.vphoto.service.FileService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
@RequestMapping("/x")
public class UploadController {
    private final FileService fileService;

    public UploadController(FileService fileService) {
        this.fileService = fileService;
    }

    @PostMapping("/products")
    public ResponseEntity<ApiResponse> uploadProductPhoto(@RequestParam("file") MultipartFile file) {
        fileService.uploadProductPhoto(file);
        return ResponseEntity.ok(new ApiResponse(true,"Product photo uploaded successfully!"));
    }

    @PostMapping("/clients")
    public ResponseEntity<ApiResponse> uploadClientPhoto(@RequestParam("file") MultipartFile file) {
        fileService.uploadClientPhoto(file);
        return ResponseEntity.ok(new ApiResponse(true,"Client photo uploaded successfully!"));
    }

    @PostMapping("/contracts")
    public ResponseEntity<ApiResponse> uploadContractPhoto(@RequestParam("file") MultipartFile file) {
        fileService.uploadContractPhoto(file);
        return ResponseEntity.ok(new ApiResponse(true,"Contract photo uploaded successfully!"));
    }
}
