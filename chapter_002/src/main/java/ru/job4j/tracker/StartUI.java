package ru.job4j.tracker;


public class StartUI {

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        String id;
        while (run) {
            this.showMenu();
            int select = Integer.valueOf(input.askStr("Select: "));
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                String name = input.askStr("Enter name: ");
                Item item = new Item(name);
                tracker.add(item);
                System.out.println("Item added");
                System.out.println();

            } else if (select == 1) {
                Item[] items = tracker.findAll();
                for (int i = 0; i < items.length; i++) {
                    System.out.print(items[i].getName() + ", Id:");
                    System.out.println(items[i].getId());
                }
                System.out.println();

            } else if (select == 2) {
                id = input.askStr("Enter Id: ");
                String newId = input.askStr("Enter new item name: ");
                if (tracker.replace(id, new Item(newId))) {
                    System.out.println("Item was replaced");
                    System.out.println();
                } else {
                    System.out.println("Item not found");
                    System.out.println();
                }

            } else if (select == 3) {
                id = input.askStr("Enter item Id: ");
                if (tracker.delete(id)) {
                    System.out.println("Item was deleted");
                    System.out.println();
                } else {
                    System.out.println("Item not found");
                    System.out.println();
                }

            } else if (select == 4) {
                Item item = tracker.findById(input.askStr("Enter item Id: "));
                if (item != null) {
                    System.out.print(item.getName() + ", Id:");
                    System.out.println(item.getId());
                    System.out.println();
                } else {
                    System.out.println("Item not found");
                    System.out.println();
                }

            } else if (select == 5) {
                Item[] items = tracker.findByName(input.askStr("Enter name: "));
                for (int i = 0; i < items.length; i++) {
                    System.out.print(items[i].getName() + ", Id:");
                    System.out.println(items[i].getId());
                }
                System.out.println();

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