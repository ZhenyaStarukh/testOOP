package classes;

import javax.swing.*;

public abstract class Object {
    protected String name;
    protected String location;
    protected int size;
    protected ImageIcon icon;

    public abstract void get_info();
    public abstract void open();

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }
}
