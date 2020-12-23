package com.Syukei.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SyukeiController {
  @GetMapping("/home")
  public String open(Model model) {
    String str = "Hello World";
    model.addAttribute("value", str);
    return "home.html";
  }
}