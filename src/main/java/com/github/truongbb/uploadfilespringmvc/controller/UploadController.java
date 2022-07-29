package com.github.truongbb.uploadfilespringmvc.controller;

import com.github.truongbb.uploadfilespringmvc.service.UploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/upload-file")
public class UploadController {

    @Autowired
    private UploadService uploadService;

    @PostMapping
    public String submit(@RequestParam("my-files") MultipartFile[] files, ModelMap modelMap) {
        boolean result = uploadService.uploadFile(files);
        modelMap.addAttribute("files", files);
        modelMap.addAttribute("result", result);
        return "handle-after-upload";
    }

}
