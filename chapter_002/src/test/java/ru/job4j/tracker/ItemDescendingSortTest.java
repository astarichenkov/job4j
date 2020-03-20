package ru.job4j.tracker;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class ItemDescendingSortTest {
    @Test
    public void when312() {
        List<Item> result = new ArrayList<Item>();
        Item item1 = new Item("test3");
        Item item2 = new Item("test1");
        Item item3 = new Item("test2");
        result.add(item1);
        result.add(item2);
        result.add(item3);
        Collections.sort(result, new ItemDescendingSort());
        List<Item> expected = new ArrayList<Item>();
        expected.add(item1);
        expected.add(item3);
        expected.add(item2);
        assertThat(result, is(expected));
    }
}
