package com.nseit.SpringBootToDoList;

import com.nseit.SpringBootToDoList.models.ToDo;
import com.nseit.SpringBootToDoList.services.MainMenu;
import com.nseit.SpringBootToDoList.repository.ToDoListRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.ArrayList;
import java.util.Scanner;

@SpringBootApplication
@ComponentScan("java.util.Scanner")
public class SpringBootToDoListApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootToDoListApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		ToDoListRepository toDoLIstUtils = new ToDoListRepository();
		ArrayList<ToDo> todos = toDoLIstUtils.getTodos();
		MainMenu mainMenu = new MainMenu(todos);
		mainMenu.printMainMenu();
	}
}
