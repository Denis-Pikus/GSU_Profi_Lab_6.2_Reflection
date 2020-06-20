package com.menu;

import com.company.MyContainer;
import com.company.ReflectionFactory;

public class AddMenuItem<T extends Comparable<T>> implements IMenuItem<T> {
    private MyContainer<T> container;
    private ReflectionFactory<T> factory;

    public AddMenuItem(MyContainer<T> container, ReflectionFactory<T> factory) {
        this.container = container;
        this.factory = factory;
    }

    @Override
    public int getOrder() {
        return 1;
    }

    @Override
    public String getTitle() {
        return "Add element";
    }

    @Override
    public void execute() {
        container.add((T) factory.create());
    }
}
