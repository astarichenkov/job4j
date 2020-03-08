package ru.job4j.tracker;

public class FindByIdAction implements UserAction {
    @Override
    public String name() {
        return "=== Find item by ID ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        Item item = tracker.findById(input.askStr("Enter item ID: "));
        if (item != null) {
            System.out.print(item.getName() + ", Id:");
            System.out.println(item.getId());
            System.out.println();
        } else {
            System.out.println("Item not found");
            System.out.println();
        }
        return true;
    }
}
