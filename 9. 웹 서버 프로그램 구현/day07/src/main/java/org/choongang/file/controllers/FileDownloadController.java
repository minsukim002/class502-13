package org.choongang.file.controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.*;
import java.nio.file.Files;

@WebServlet("/file/download")
public class FileDownloadController extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        File file = new File("D:/uploads/1.png");
        String contentType = Files.probeContentType(file.toPath());
        // 윈도우즈에서 한글 깨짐문제 발생, 인코딩 UTF-8 -> CPC949, EUC-KR, IS08859_1
        String fileName = new String(file.getName().getBytes(),"ISO-8859-1");

        //헤더 부분
        resp.setHeader("Content-Disposition", "attachment; filename" + fileName);
        resp.setContentType(contentType);
        resp.setHeader("Cache-Control", "no-cache");
        resp.setIntHeader("Expires", 0);
        resp.setContentLengthLong(file.length());



        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file))) {
            OutputStream out = resp.getOutputStream();
            out.write(bis.readAllBytes());
        }
    }
}
