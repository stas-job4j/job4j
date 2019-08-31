package ru.job4j.tracker;

import java.util.Objects;
/**
 * @author Sinkevich Stanislau (saydobenothing@gmail.com)
 * @version $ 1.0 $
 * @since 16.09.2019
 */

public class Item {
    private String id;
    private String name;
    private String desc;
    private long time;

    public Item(String name, String desc, long time) {
        this.name = name;
        this.desc = desc;
        this.time = time;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName() {
        this.name = name;
    }
    public String getDesc() {
        return desc;
    }
    public void setDesc() {
        this.desc = desc;
    }
    public long getTime() {
        return time;
    }
    public void setTime() {
        this.time = time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Item item = (Item) o;
        return time == item.time
                &&
                Objects.equals(id, item.id)
                &&
                Objects.equals(name, item.name)
                &&
                Objects.equals(desc, item.desc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, desc, time);
    }
}
