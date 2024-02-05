package it.epicode.w5d1;

import it.epicode.w5d1.bean.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.List;

@Configuration
public class AppConfig {

    @Bean("margherita")
    @Scope("prototype")
    public Pizza pizzaMargherita() {
        Pizza pizza = new Pizza();
        pizza.setName("Margherita");
        pizza.setBase(Base.TOMATO);
        pizza.setCalories(1104);
        pizza.setPrice(4.99);
        pizza.setToppings(List.of(cheese()));
        return pizza;
    }

    @Bean("hawaiian")
    @Scope("prototype")
    public Pizza pizzaHawaiian() {
        Pizza pizza = new Pizza();
        pizza.setName("Hawaiian");
        pizza.setBase(Base.TOMATO);
        pizza.setCalories(1024);
        pizza.setPrice(6.49);
        pizza.setToppings(List.of(cheese(), ham(), pineapple()));
        return pizza;
    }

    @Bean("diavola")
    @Scope("prototype")
    public Pizza pizzaDiavola() {
        Pizza pizza = new Pizza();
        pizza.setName("Diavola");
        pizza.setBase(Base.TOMATO);
        pizza.setCalories(1160);
        pizza.setPrice(5.99);
        pizza.setToppings(List.of(cheese(), salami()));
        return pizza;
    }

    @Bean
    public Topping cheese() {
        return new Topping("Cheese",92 ,0.69);
    }
    @Bean
    public Topping ham() {
        return new Topping("Ham", 35, 0.99);
    }
    @Bean
    public Topping onions() {
        return new Topping("Onions", 22, 0.69);
    }
    @Bean
    public Topping pineapple() {
        return new Topping("Pineapple", 24, 0.79);
    }
    @Bean
    public Topping salami() {
        return new Topping("Salami", 86, 0.99);
    }

    @Bean
    public Beverage lemonade() {
        Beverage lemonade = new Beverage();
        lemonade.setName("Lemonade");
        lemonade.setCalories(128);
        lemonade.setPrice(1.29);
        lemonade.setQuantityLiters("0.33l");

        return lemonade;
    }

    @Bean
    public Beverage water() {
        Beverage water = new Beverage();
        water.setName("Water");
        water.setCalories(0);
        water.setPrice(1.29);
        water.setQuantityLiters("0.5l");

        return water;
    }

    @Bean
    public Beverage wine() {
        Beverage wine = new Beverage();
        wine.setName("Wine");
        wine.setCalories(607);
        wine.setPrice(7.49);
        wine.setQuantityLiters("0.75l");
        wine.setAlcoholicPercentage("13%");

        return wine;
    }

    @Bean("menulist")
    public Menu menuList() {
        return new Menu(List.of(pizzaMargherita(),pizzaHawaiian(),pizzaDiavola()),List.of(water(),wine(),lemonade()), List.of(ham(),cheese(),onions(),salami(),pineapple()));
    }

}
