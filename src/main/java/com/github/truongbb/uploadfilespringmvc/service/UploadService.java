package com.github.truongbb.uploadfilespringmvc.service;


import org.springframework.web.multipart.MultipartFile;

public interface UploadService {

    boolean uploadFile(MultipartFile[] files);

}
