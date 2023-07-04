package com.cos.blog.test;

import org.springframework.web.bind.annotation.*;

// @Controller     : 요청 -> 응답(HTML 파일)
// @RestController : 요청 -> 응답(Data)
@RestController
public class HttpControllerTest {

    @GetMapping("/http/get")
    public String getTest(@RequestParam int id, @RequestParam String username, Member member) { // MessageConverter (스프링부트)
        return "GET 요청 : " + id + username + member.getUsername() + member.getEmail();
    }

    @PostMapping("/http/post") // text/plain, application/json
    public String postTest(@RequestBody Member member) { // MessageConverter (스프링부트)
        return "POST 요청 : " + member.toString();
    }

    @PutMapping("/http/put")
    public String putTest(@RequestBody Member member) {
        return "PUT 요청 : " + member.toString();
    }

    @DeleteMapping("/http/delete")
    public String deleteTest() {
        return "DELETE 요청";
    }
}
