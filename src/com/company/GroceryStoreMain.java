package com.company;

import com.menu.*;
import com.store.GroceryStore;

import java.util.ArrayList;
import java.util.List;

public class GroceryStoreMain {
    public static void main(String[] args) throws ClassNotFoundException {

        NewContainer container = new NewContainer();
        List<Class<?>> listOfClasses = List.of(Class.forName("FishStore"), Class.forName("MeatStore"),
                Class.forName("SweetStore"), Class.forName("VegetableStore"));
        ReflectionFactory<GroceryStore> factory = new ReflectionFactory(listOfClasses);
        ArrayList<IMenuItem> list = new ArrayList<>();
        list.add(new AddMenuItem<>(container, factory));
        list.add(new UpdateMenuItem<>(container, factory));
        list.add(new DeleteMenuItem<>(container));
        list.add(new PrintAllMenuItem<>(container));
        list.add(new SortMenuItem<>(container));
        list.add(new SaveToFileMenuItem<>(container));
        list.add(new LoadFromFileMenuItem<>(container));
        new MyMenu(list, "Super menu", 0).run();
    }
}
