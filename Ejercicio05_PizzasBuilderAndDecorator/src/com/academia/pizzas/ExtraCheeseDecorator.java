package com.academia.pizzas;

import com.academia.interfaces.PizzaOrder;

public class ExtraCheeseDecorator extends PizzaDecorator {
    public ExtraCheeseDecorator(PizzaOrder wrapped) { super(wrapped); }

    @Override
    public String getDescription() {
        return wrapped.getDescription() + " + Extra Queso";
    }

    @Override
    public double getPrice() {
        // TODO: precio original + 2.50
        return wrapped.getPrice() + 2.50;
    }
}