package com.dinotaurent.RelojU;

import com.dinotaurent.RelojU.Gui.Ventana;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class RelojUApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = new SpringApplicationBuilder(RelojUApplication.class).headless(false).run(args);
		Ventana x = context.getBean(Ventana.class);
//		SpringApplication.run(RelojUApplication.class, args);
//		System.out.println("Aplicacion corriendo!!");
	}

}
