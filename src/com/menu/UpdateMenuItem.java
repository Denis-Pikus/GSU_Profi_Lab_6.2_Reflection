package com.menu;

import com.company.MyContainer;
import com.company.ReflectionFactory;
import com.company.ScannerWrapper;

public class UpdateMenuItem<T extends Comparable<T>> implements IMenuItem<T> {
    private MyContainer<T> container;
    private ReflectionFactory<T> factory;
    private ScannerWrapper sc = new ScannerWrapper();

    public UpdateMenuItem(MyContainer<T> container, ReflectionFactory<T> factory) {
        this.container = container;
        this.factory = factory;
    }

    @Override
    public int getOrder() {
        return 2;
    }

    @Override
    public String getTitle() {
        return "Update element";
    }

    @Override
    public void execute() {
        System.out.println("Input index");
        int index = sc.nextInt();
        container.update(index - 1, (T) factory.create());
    }
}
