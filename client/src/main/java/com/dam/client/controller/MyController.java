package com.dam.client.controller;

import java.util.Map;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class MyController {

  @Value("${msg1}")
  private String msg1;

  @Value("${msg2}")
  private String msg2;

  @Value("${database.url}")
  private String url;

  @GetMapping(value = "/")
  public ResponseEntity<Map> getProperties() {
    return ResponseEntity.ok().body(
        Map.of(
            "msg1", msg1,
            "msg2", msg2,
            "database.url", url)
    );
  }

}
