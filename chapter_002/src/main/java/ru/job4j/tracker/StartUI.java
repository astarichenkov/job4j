package ru.job4j.tracker;


public class StartUI {

    public static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Create a new Item ====");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
        System.out.println();
    }

    public static void showAllItems(Input input, Tracker tracker) {
        Item[] items = tracker.findAll();
        for (int i = 0; i < items.length; i++) {
            System.out.print(items[i].getName() + ", Id:");
            System.out.println(items[i].getId());
        }
        System.out.println();
    }

    public static void editItem(Input input, Tracker tracker) {
        String id = input.askStr("Enter Id: ");
        String newId = input.askStr("Enter new item name: ");
        if (tracker.replace(id, new Item(newId))) {
            System.out.println("Item was replaced");
        } else {
            System.out.println("Item not found");
            System.out.println();
        }
        System.out.println();
    }

    public static void deleteItem(Input input, Tracker tracker) {
        String id = input.askStr("Enter item Id: ");
        if (tracker.delete(id)) {
            System.out.println("Item was deleted");
            System.out.println();
        } else {
            System.out.println("Item not found");
            System.out.println();
        }
    }

    public static void findItemsById(Input input, Tracker tracker) {
        Item item = tracker.findById(input.askStr("Enter item ID: "));
        if (item != null) {
            System.out.print(item.getName() + ", Id:");
            System.out.println(item.getId());
            System.out.println();
        } else {
            System.out.println("Item not found");
            System.out.println();
        }

    }

    public static void findItemsByName(Input input, Tracker tracker) {
        Item[] items = tracker.findByName(input.askStr("Enter name: "));
        for (int i = 0; i < items.length; i++) {
            System.out.print(items[i].getName() + ", Id:");
            System.out.println(items[i].getId());
        }
        System.out.println();
    }

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = Integer.parseInt(input.askStr("Select: "));
            if (select == 0) {
                StartUI.createItem(input, tracker);
            } else if (select == 1) {
                StartUI.showAllItems(input, tracker);
            } else if (select == 2) {
                StartUI.editItem(input, tracker);
            } else if (select == 3) {
                StartUI.deleteItem(input, tracker);
            } else if (select == 4) {
                StartUI.findItemsById(input, tracker);
            } else if (select == 5) {
                StartUI.findItemsByName(input, tracker);
            } else if (select == 6) {
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu.\n"
                + "0. Add new Item\n"
                + "1. Show all items\n"
                + "2. Edit item\n"
                + "3. Delete item\n"
                + "4. Find item by Id\n"
                + "5. Find items by name\n"
                + "6. Exit Program\n"
                + "Select:\n");
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        tracker.add(new Item("Item1"));
        tracker.add(new Item("Item222"));
        tracker.add(new Item("Item33"));
        new StartUI().init(input, tracker);
    }
}