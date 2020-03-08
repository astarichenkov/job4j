package ru.job4j.tracker;

public class DeleteAction implements UserAction {
    @Override
    public String name() {
        return "=== Delete item ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Enter item Id: ");
        if (tracker.delete(id)) {
            System.out.println("Item was deleted");
            System.out.println();
        } else {
            System.out.println("Item not found");
            System.out.println();
        }
        return true;
    }
}
