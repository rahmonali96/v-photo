package com.example.vphoto.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Path;

/**
 * Developed by Rahmonali Yoqubov
 * Email: rahmonaliyoqubov@gmail.com
 * Date: 20.10.2022
 * Project: v-photo
 */
@Service
public class FileService {
    public void uploadProductPhoto(MultipartFile file) {
        try {
            file.transferTo(Path.of(String.format("/home/products/%s", file.getOriginalFilename())));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void uploadClientPhoto(MultipartFile file) {
        try {
            file.transferTo(Path.of(String.format("/home/clients/%s", file.getOriginalFilename())));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void uploadContractPhoto(MultipartFile file) {
        try {
            file.transferTo(Path.of(String.format("/home/contracts/%s", file.getOriginalFilename())));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
