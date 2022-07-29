package com.github.truongbb.uploadfilespringmvc.service;

import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@Service
public class UploadServiceImpl implements UploadService {

    private static final String TARGET_FOLDER = "D:/upload-folder";

    @Override
    public boolean uploadFile(MultipartFile[] files) {
        List<MultipartFile> multipartFiles = Arrays.asList(files);
        if (CollectionUtils.isEmpty(multipartFiles)) {
            return false;
        }

        File uploadFolder = new File(TARGET_FOLDER);
        if (!uploadFolder.exists()) {
            boolean mkdir = uploadFolder.mkdir();
            if (!mkdir) {
                return false;
            }
        }

        for (int i = 0; i < multipartFiles.size(); i++) {
            MultipartFile file = multipartFiles.get(i);
            if (ObjectUtils.isEmpty(file)) {
                return false;
            }
            String fileName = TARGET_FOLDER + File.separator + file.getOriginalFilename();
            try (BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(fileName))) {
                outputStream.write(file.getBytes());
            } catch (IOException e) {
                e.printStackTrace();
                return false;
            }
        }
        return true;
    }
}
