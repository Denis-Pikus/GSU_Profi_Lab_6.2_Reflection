package com.menu;

import com.company.MyContainer;

public class PrintAllMenuItem<T extends Comparable<T>> implements IMenuItem<T> {
    private MyContainer<T> container;

    public PrintAllMenuItem(MyContainer<T> container) {
        this.container = container;
    }

    @Override
    public int getOrder() {
        return 4;
    }

    @Override
    public String getTitle() {
        return "Print all";
    }

    @Override
    public void execute() {
       container.printAll();
    }
}
