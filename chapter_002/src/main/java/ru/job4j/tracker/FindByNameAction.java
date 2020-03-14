package ru.job4j.tracker;

import java.util.List;

public class FindByNameAction implements UserAction {
    @Override
    public String name() {
        return "=== Find items by name ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        List<Item> items = tracker.findByName(input.askStr("Enter name: "));
        for (int i = 0; i < items.size(); i++) {
            System.out.print(items.get(i).getName() + ", Id:");
            System.out.println(items.get(i).getId());
        }
        System.out.println();
        return true;
    }
}
