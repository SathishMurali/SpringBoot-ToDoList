package com.nseit.SpringBootToDoList.repository;

import com.nseit.SpringBootToDoList.models.ToDo;
import lombok.Getter;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Getter
@Repository
public class ToDoListRepository {
    private ArrayList<ToDo> todos = new ArrayList<>();
}