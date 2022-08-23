package com.nseit.SpringBootToDoList.services;

import com.nseit.SpringBootToDoList.models.ToDo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Scanner;

@Service

public class MainMenu {
    @Autowired
    private ArrayList<ToDo> todos;

    public MainMenu(ArrayList<ToDo> todos) {
        this.todos = todos;
    }

    private Scanner scanner = new Scanner(System.in);

    public void printMainMenu() {
       while(true) {
            System.out.println("Welcome to ToDoList Application");
            System.out.println("--------------------------------------");

            System.out.println("1. Add Notes");
            System.out.println("2. View Notes");
            System.out.println("3. Delete Notes");
            System.out.println("4. Exit");
            System.out.println("--------------------------------------");

            System.out.print("Enter your Choice: ");
            int userChoice = scanner.nextInt();

           switch (userChoice) {
               case 1 -> addNotes();
               case 2 -> viewNotes();
               case 3 -> deleteNotes();
               case 4 -> System.exit(0);
               default -> {
               }
           }
        }
    }

    public void addNotes() {
        System.out.println("Enter the Topic: ");
        String userTopics = scanner.next();
        System.out.println("Enter the Notes: ");
        String userDescription = scanner.next();

        todos.add(new ToDo(todos.size() + 1, userTopics, userDescription));

        System.out.println("Successfully Notes Added!");

    }

    public void viewNotes(){
        for (ToDo todo: todos){
            System.out.println(todo.getId() + " " + todo.getNote() + " " + todo.getDescription());
        }
        System.out.println("----------------------------");
        printMainMenu();
    }

    public void deleteNotes(){
        for (ToDo todo: todos){
            System.out.println(todo.getId() + " " + todo.getNote() + " " + todo.getDescription());
        }
        System.out.print("Enter your Choice: ");
        int userDeleteChoice = scanner.nextInt();
        ToDo toDo = new ToDo();
        todos.remove(userDeleteChoice - 1);
//        if (userDeleteChoice == toDo.getId()){
//            todos.remove(userDeleteChoice - 1);
//        }else{
//            System.out.println("Invalid Delete Choice!");
//        }

        System.out.println("Successfully Deleted!");
    }
}
