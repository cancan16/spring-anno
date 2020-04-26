package com.enjoy.designer.decorate;

public class Test {
   public static void main(String[] args) {
       Food food = new Bread(new Vegetable(new Cream(new Food("œ„≥¶"))));
       System.out.println(food.make());
   }
}