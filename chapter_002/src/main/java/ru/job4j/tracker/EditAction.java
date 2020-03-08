package ru.job4j.tracker;

public class EditAction implements UserAction {
    @Override
    public String name() {
        return "=== Edit item ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Enter Id: ");
        String newId = input.askStr("Enter new item name: ");
        if (tracker.replace(id, new Item(newId))) {
            System.out.println("Item was replaced");
        } else {
            System.out.println("Item not found");
            System.out.println();
        }
        System.out.println();
        return true;
    }
}
