package it.epicode.w5d1.bean;

import lombok.*;

@Data
public abstract class MenuItem {
    private String  name;
    private int     calories;
    private double  price;
}
