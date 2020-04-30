package com.eric.board;

import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class BoardService {
  
  @Autowired
  BoardRepository repository;
  
  @Cacheable(key = "#searchKeys", value = "getBoards")
  public List<Board> getBoards(Map<String, String> searchKeys) {
    return repository.findByKeys(searchKeys);
  }
}
