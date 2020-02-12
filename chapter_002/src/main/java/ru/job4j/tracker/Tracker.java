package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Random;

/**
 * @version $Id$
 * @since 0.1
 */
public class Tracker {
    /**
     * Массив для хранение заявок.
     */
    private final Item[] items = new Item[100];

    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0;

    /**
     * Метод реализующий добавление заявки в хранилище
     *
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        this.items[this.position++] = item;
        return item;
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     *
     * @return Уникальный ключ.
     */
    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }


    /**
     * Метод проверяет в цикле все элементы массива this.items.
     *
     * @param key
     * @return Массив элементов, у которых совпадает name.
     */
    public Item[] findByName(String key) {
        int size = 0;
        Item[] result = new Item[this.items.length];
        for (int i = 0; i < this.position; i++) {
            if (this.items[i].getName().equals(key)) {
                result[size] = this.items[i];
                size++;
            }
        }
        return Arrays.copyOf(result, size);
    }

    /**
     * Получение списка всех заявок.
     */
    public Item[] findAll(String key) {
        return Arrays.copyOf(items, position);
    }

    /**
     * Метод public Item findById(String id) проверяет в цикле все элементы массива this.items,
     * сравнивая id с аргументом String id и возвращает найденный Item. Если Item не найден - возвращает null.
     */
    public Item findById(String key) {
        return items[indexOf(key)];
    }

    /**
     * метод, который будет возвращать index по id.
     *
     * @param id
     */

    private int indexOf(String id) {
        int rsl = -1;
        for (int index = 0; index < position; index++) {
            if (items[index].getId().equals(id)) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public boolean replace(String id, Item item) {
        int index = indexOf(id);
        if (index == -1) {
            return false;
        }
        this.items[index].setName(item.getName());
        return true;
    }


}