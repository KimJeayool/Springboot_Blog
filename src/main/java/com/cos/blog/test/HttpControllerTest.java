package com.cos.blog.test;

import org.springframework.web.bind.annotation.*;

// @Controller     : 요청 -> 응답(HTML 파일)
// @RestController : 요청 -> 응답(Data)
@RestController
public class HttpControllerTest {

    @GetMapping("/http/get")
    public String getTest() {
        return "GET 요청";
    }

    @PostMapping("/http/post")
    public String postTest() {
        return "POST 요청";
    }

    @PutMapping("/http/put")
    public String putTest() {
        return "PUT 요청";
    }

    @DeleteMapping("/http/delete")
    public String deleteTest() {
        return "DELETE 요청";
    }
}
