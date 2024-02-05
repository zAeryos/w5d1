package it.epicode.w5d1.bean;

import lombok.*;

@Data
public class Beverage extends MenuItem {
    private String quantityLiters;
    private String alcoholicPercentage;

    @Override
    public String toString() {
        return "Beverage{" +
                super.toString() +
                "quantityLiters='" + quantityLiters + '\'' +
                ", alcoholicPercentage='" + alcoholicPercentage + '\'' +
                '}';
    }
}
