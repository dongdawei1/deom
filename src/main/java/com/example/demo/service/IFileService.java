package com.example.demo.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by geely
 */
public interface IFileService {

    String upload(MultipartFile file, String path);
}
