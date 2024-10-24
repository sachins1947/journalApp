package com.codexsachin1947s.journalApp.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck {

  @GetMapping("/health_check")
  String healthCheck() {
      return "OK";
  }
}
