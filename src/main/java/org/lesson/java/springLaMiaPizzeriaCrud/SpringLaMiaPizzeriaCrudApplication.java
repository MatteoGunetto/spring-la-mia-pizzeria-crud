package org.lesson.java.springLaMiaPizzeriaCrud;

import org.lesson.java.springLaMiaPizzeriaCrud.DB.Pizze;
import org.lesson.java.springLaMiaPizzeriaCrud.DB.serv.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringLaMiaPizzeriaCrudApplication implements CommandLineRunner {

	@Autowired
	private PizzaService pizzaService;

	public static void main(String[] args) {
		SpringApplication.run(SpringLaMiaPizzeriaCrudApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Pizze pizza1 = new Pizze("Margherita", "La pizza Margherita è una pizza classica italiana che è composta da una base di pasta, salsa di pomodoro, mozzarella e basilico. ", "https://upload.wikimedia.org/wikipedia/commons/c/c8/Pizza_Margherita_stu_spivack.jpg", 4.99f);

		Pizze pizza2 = new Pizze("Diavola", "Pizza dal sapore intenso e piccante, con un contrasto tra la dolcezza della salsa di pomodoro e la sapidità del salamino piccante. La mozzarella filante completa il piatto, rendendolo ancora più gustoso.", "https://plus.unsplash.com/premium_photo-1668771085743-1d2d19818140?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=2787&q=80", 9.50f);

		Pizze pizza3 = new Pizze("Americana", "La pizza per i più piccoli o per chi si sente ancora giovane dentro", "https://media-cdn.tripadvisor.com/media/photo-s/0b/eb/60/38/pizza-viennese.jpg", 9.00f);

		Pizze pizza4 = new Pizze("4 stagioni", "La pizza quattro stagioni è un'ottima scelta per chi vuole assaggiare un po' di tutto. È anche una buona scelta per i bambini, che possono scegliere il proprio spicchio preferito.", "https://cdn.cook.stbm.it/thumbnails/ricette/144/144880/hd750x421.jpg", 11.00f);

		Pizze pizza5 = new Pizze("Speck&Brie", "Un sapore ricco e saporito, con un contrasto tra il sapore sapido dello speck e il sapore dolce e cremoso del brie.", "https://shop.aostapizzapazza.it/utenti/mancuso_it/cache/_pics/2/8/pizza-affumicata-1_9bfd18c14668eda8afb51dbee2ec85f5_t.jpg", 12.00f);


		pizzaService.save(pizza1);
		pizzaService.save(pizza2);
		pizzaService.save(pizza3);
		pizzaService.save(pizza4);
		pizzaService.save(pizza5);

		System.out.println("!!--------!! Seeded the db with success !!--------!!");
	}

}