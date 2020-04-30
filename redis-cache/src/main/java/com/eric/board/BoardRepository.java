package com.eric.board;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;

@Repository
public class BoardRepository {
  public List<Board> findByKeys(Map<String, String> searchKeys) {
    System.out.println("DB 조회를 하셨네요!");
    ArrayList<Board> boards = new ArrayList<Board>();
    int size = Integer.parseInt(searchKeys.get("size"));
    
    
    for (int i = 0; i < size; i++) {
      boards.add(new Board(i + 0L, i + "번째 게시물", i + "번째 내용"));
    }
    
    return boards;
  }
  

}
