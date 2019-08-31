package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * @author Sinkevich Stanislau (saydobenothing@gmail.com)
 * @version $ 1.0 $
 * @since 23.08.2019
 */

public class TrackerTest {

    /**
     * Тест метода add
     */
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        long created = System.currentTimeMillis();
        Item item = new Item("test1", "testDescription", created);
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }

    /**
     * Тест метода replace
     */
    @Test
    public void whenReplaceNameThenReturnNewName() {
        Tracker tracker = new Tracker();
        Item previous = tracker.add(new Item("test1", "testDescription", 123L));
        Item next = new Item("test2", "testDescription2", 1234L);
        next.setId(previous.getId());
        tracker.replace(previous.getId(), next);
        assertThat(tracker.findById(previous.getId()).getName(), is("test2"));
    }

    /**
     * Тест метода delete
     */
    @Test
    public void whenDeleteItemThenTrackerHasNoItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1", "testDescription", 123L);
        tracker.add(item);
        boolean result = tracker.delete(item.getId());
        assertThat(result, is(true));
    }

    /**
     * Тест метода findAll
     */
    @Test
    public void whenFindAllItemThenReturnCopyArray() {
        Tracker tracker = new Tracker();
        Item one = tracker.add(new Item("test", "testDesc", 123L));
        Item two = tracker.add(new Item("test1", "testDesc", 123L));
        Item three = tracker.add(new Item("test2", "testDesc", 123L));
        Item four = null;
        Item five = tracker.add(new Item("test3", "testDesc", 123L));
        Item[] value = new Item[] {one, two, three, five};
        assertThat(tracker.findAll(), is(value));
    }

    /**
     * Тест метода findByName
     */
    @Test
    public void whenFindByNameItemThenReturnCopyArray() {
        Tracker tracker = new Tracker();
        Item one = tracker.add(new Item("test2", "testDesc", 123L));
        Item two = tracker.add(new Item("test1", "testDesc", 123L));
        Item three = tracker.add(new Item("test2", "testDesc", 123L));
        Item four = tracker.add(new Item("test", "testDesc", 123L));
        Item[] value = new Item[] {one, three};
        assertThat(tracker.findByName(one.getName()), is(value));
    }
}


