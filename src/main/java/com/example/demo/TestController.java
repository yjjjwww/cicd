package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class TestController {
  @GetMapping
  public ResponseEntity<String> getArticleByPageable() {
    return ResponseEntity.ok().body("이게 보이면 성공");
  }
}
