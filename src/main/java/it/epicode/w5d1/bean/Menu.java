package it.epicode.w5d1.bean;

import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Menu {
    private List<Pizza>     pizzasList;
    private List<Beverage>  beverageList;
    private List<Topping>   toppingList;

    public void printMenu() {
        pizzasList.stream().forEach(pizza -> System.out.println(pizza));
        beverageList.stream().forEach(beverage -> System.out.println(beverage));
        toppingList.stream().forEach(topping -> System.out.println(topping));
    }
}
