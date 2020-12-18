package com.dam.server.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  @GetMapping(value = "/")
  public ResponseEntity<String> getProperties() {
    return ResponseEntity.ok().body("Hello");
  }

}
