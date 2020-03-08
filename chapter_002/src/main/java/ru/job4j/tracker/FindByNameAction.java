package ru.job4j.tracker;

public class FindByNameAction implements UserAction {
    @Override
    public String name() {
        return "=== Find items by name ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        Item[] items = tracker.findByName(input.askStr("Enter name: "));
        for (int i = 0; i < items.length; i++) {
            System.out.print(items[i].getName() + ", Id:");
            System.out.println(items[i].getId());
        }
        System.out.println();
        return true;
    }
}
