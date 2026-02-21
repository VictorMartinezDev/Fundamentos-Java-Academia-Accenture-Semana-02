package com.academia.pizzas;

import com.academia.interfaces.PizzaOrder;

public class GiftBoxDecorator extends PizzaDecorator {
    public GiftBoxDecorator(PizzaOrder wrapped) { super(wrapped); }

    @Override
    public String getDescription() {
        return wrapped.getDescription() + " + Caja Regalo";
    }

    @Override
    public double getPrice() {
        // TODO: precio original + 3.00
        return wrapped.getPrice() + 3.00;
    }
}
