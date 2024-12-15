package de.telran.onlineshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OnlineShopApplication {
	// 1 уровень сложности: Добавьте в Service мапперы для преобразования из Dto слоя в Entity и наоборот.
    //
	// Выполнил для  Products - товары

	public static void main(String[] args) {
		SpringApplication.run(OnlineShopApplication.class, args);
	}

}
