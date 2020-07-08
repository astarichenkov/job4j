package ru.job4j.search;

import java.util.LinkedList;

public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();

    /**
     * Метод должен вставлять в нужную позицию элемент.
     * Позиция определять по полю приоритет.
     * Для вставки использовать add(int index, E value)
     *
     * @param task задача
     */
    public void put(Task task) {
        var index = 0;
        if (tasks.size() == 0) {
            this.tasks.add(index, task);
            return;
        }
        for (var element : tasks) {
            if (element.getPriority() < task.getPriority()) {
                index++;
            } else {
                this.tasks.add(index, task);
                break;
            }
        }
    }

    public Task take() {
        return tasks.remove(0);
    }
}