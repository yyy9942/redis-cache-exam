package com.eric.board;

import java.util.HashMap;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BoardController {
  
  @Autowired
  BoardService service;
  
  @GetMapping("tt")
  public String boardsTt(String size, Model model) {
    HashMap<String, String> map = new HashMap<String, String>();
    map.put("size", size);
    List<Board> boards = service.getBoards(map);
    model.addAttribute("boards", boards);
    
    
    return "main";
  }
  
  @GetMapping("dd")
  @ResponseBody
  public String boardsDd(String size, Model model) {
    HashMap<String, String> map = new HashMap<String, String>();
    map.put("size", size);
    List<Board> boards = service.getBoards(map);
    model.addAttribute("boards", boards);
    
    
    return "main";
  }

}
