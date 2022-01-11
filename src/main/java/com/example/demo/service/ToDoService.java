package com.example.demo.service;

import com.example.demo.entity.ToDoEntity;
import com.example.demo.entity.ToDoRequest;
import com.example.demo.repository.ToDoRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
@AllArgsConstructor
public class ToDoService {
    private final ToDoRepository toDoRepository;

    // 추가
    public ToDoEntity add(ToDoRequest toDoRequest){
        ToDoEntity toDoEntity = new ToDoEntity();
        toDoEntity.setTitle(toDoRequest.getTitle());
        toDoEntity.setOrder(toDoRequest.getOrder());
        toDoEntity.setCompleted(toDoRequest.getCompleted());

        return this.toDoRepository.save(toDoEntity);
    }
    // 아이디 조회
    public ToDoEntity searchById(Long id){
        return this.toDoRepository.findById(id).orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND));

    }
    //  전부 조회
    public List<ToDoEntity> searchAll(){
        return this.toDoRepository.findAll();
    }
    // 수정
    public ToDoEntity updateById(Long id, ToDoRequest request){
        ToDoEntity toDoEntity = new ToDoEntity();
        if(request.getTitle()!=null)
            toDoEntity.setTitle(request.getTitle());
        if(request.getCompleted()!=null)
            toDoEntity.setCompleted(request.getCompleted());
        if(request.getOrder()!=null)
            toDoEntity.setOrder(request.getOrder());

        return this.toDoRepository.save(toDoEntity);
    }
    // 삭제
    public void deleteById(Long id){
        this.toDoRepository.deleteById(id);
    }
    public void deleteAll(Long id){
         this.toDoRepository.deleteAll();
    }
}
