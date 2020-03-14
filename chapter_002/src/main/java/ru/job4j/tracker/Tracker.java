package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * @version $Id$
 * @since 0.1
 */
public class Tracker {
    /**
     * Массив для хранение заявок.
     */
//    public final Item[] items = new Item[5];
    public final List<Item> items = new ArrayList<>();
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
        this.items.add(item);
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
    public List<Item> findByName(String key) {
        ArrayList<Item> result = new ArrayList<Item>();
        for (Item item : items) {
            if (item.getName().contains(key)) {
                result.add(item);
            }
        }
        return result;
    }

    /**
     * Получение списка всех заявок.
     */
    public List<Item> findAll() {
        return items;
    }

    /**
     * Метод public Item findById(String id) проверяет в цикле все элементы массива this.items,
     * сравнивая id с аргументом String id и возвращает найденный Item. Если Item не найден - возвращает null.
     */

    public Item findById(String key) {
        int index = indexOf(key);
        if (index != -1) {
            return this.items.get(index);
        }
        return null;
    }

    /**
     * метод, который будет возвращать index по id.
     *
     * @param id
     */

    private int indexOf(String id) {
        for (int index = 0; index < items.size(); index++) {
            if (items.get(index).getId().equals(id)) {
                return index;
            }
        }
        return -1;
    }

    public boolean replace(String id, Item item) {
        int index = indexOf(id);
        if (index == -1) {
            return false;
        }
        this.items.get(index).setName(item.getName());
        return true;
    }

    public boolean delete(String id) {
        int index = indexOf(id);
        if (index == -1) {
            return false;
        }
        items.remove(index);
        return true;
    }
}




