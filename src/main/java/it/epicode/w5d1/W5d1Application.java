package it.epicode.w5d1;

import it.epicode.w5d1.bean.Menu;
import it.epicode.w5d1.bean.Pizza;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class W5d1Application {

	public static void main(String[] args) {
		SpringApplication.run(W5d1Application.class, args);
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

		Pizza pizzaMargherita = ctx.getBean("margherita", Pizza.class);
		System.out.println(pizzaMargherita);

		Pizza pizzaHawaiian = ctx.getBean("hawaiian", Pizza.class);
		System.out.println(pizzaHawaiian);

		Pizza pizzaDiavola = ctx.getBean("diavola", Pizza.class);
		System.out.println(pizzaDiavola);

		Menu menu = ctx.getBean("menulist", Menu.class);
		System.out.println(menu);
	}
}
