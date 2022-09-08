package com.example.ItemManagement;

import com.example.ItemManagement.model.Item;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication

public class ItemManagementApplication {
	//main app
	public static void main(String[] args) {

		SpringApplication.run(ItemManagementApplication.class, args);
	}

}
