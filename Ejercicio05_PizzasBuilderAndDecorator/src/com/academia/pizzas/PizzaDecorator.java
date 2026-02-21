package com.academia.pizzas;

import com.academia.interfaces.PizzaOrder;

abstract class PizzaDecorator implements PizzaOrder {
    protected final PizzaOrder wrapped;
    PizzaDecorator(PizzaOrder wrapped) { this.wrapped = wrapped; }
}