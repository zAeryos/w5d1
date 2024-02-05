package it.epicode.w5d1.bean;


import lombok.*;

@Data
@AllArgsConstructor
public class Topping {
    private String  name;
    private int     calories;
    private double  price;
}
