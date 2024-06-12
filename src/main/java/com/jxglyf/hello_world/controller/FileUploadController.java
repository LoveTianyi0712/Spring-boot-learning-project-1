package com.jxglyf.hello_world.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@RestController
public class FileUploadController {

    @PostMapping("/upload")
    public String up(String nickname, MultipartFile photo, HttpServletRequest request) throws IOException {
        System.out.println(nickname);
        // Get the original name of the photo
        System.out.println(photo.getOriginalFilename());
        // Get the file type
        System.out.println(photo.getContentType());

        // web server context: get the directory
        String path = request.getServletContext().getRealPath("/upload/");
        System.out.println(path);
        saveFile(photo, path);
        return "Uploaded Successfully!";
    }

    public void saveFile(MultipartFile photo, String path) throws IOException {
        // Judge whether the saving directory exists. If not exists, then create
        File dir = new File(path);
        if (!dir.exists()) {
            // Create directory
            dir.mkdir();
        }

        File file = new File(path+photo.getOriginalFilename());
        photo.transferTo(file);
    }
}
