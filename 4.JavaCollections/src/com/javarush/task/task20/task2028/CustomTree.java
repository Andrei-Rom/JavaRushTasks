package com.javarush.task.task20.task2028;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collection;
import java.util.List;

/* 
Построй дерево(1)
*/
public class CustomTree extends AbstractList<String> implements Cloneable, Serializable {
    Entry<String> root;
    private int size;

    static class Entry<T> implements Serializable {
        String elementName;
        boolean availableToAddLeftChildren;
        boolean availableToAddRightChildren;
        Entry<T> parent;
        Entry<T> leftChild;
        Entry<T> rightChild;

        public Entry(String elementName) {
            this.elementName = elementName;
            this.availableToAddLeftChildren = true;
            this.availableToAddRightChildren = true;
        }

        boolean isAvailableToAddChildren() {
            return availableToAddLeftChildren || availableToAddRightChildren;
        }
    }

    public CustomTree() {
        root = new Entry<>("");
        root.parent = null;
        root.leftChild = null;
        root.rightChild = null;
        size = 0;
    }

    @Override
    public boolean add(String s) {
        Entry<String> x = root;
        Entry<String> y = null;
        while (x != null) {
            int cmp = s.compareTo(x.elementName);
            if (cmp == 0) {
                return true;
            } else {
                y = x;
                if (cmp < 0) {
                    x = x.leftChild;
                } else  {
                    x = x.rightChild;
                }
            }
        }
        Entry<String> newEntry = new Entry<>(s);
        if (y == null) {
            root = newEntry;
        } else {
            if (s.compareTo(y.elementName) < 0) {
                y.leftChild = newEntry;
            } else {
                y.rightChild = newEntry;
            }
        }
        return true;
    }


    @Override
    public int size() {
        return size;
    }

    public String getParent(String s) {
        // сделать этот
        return null;
    }







    @Override
    public String get(int index) {
        throw new UnsupportedOperationException();
    }



    @Override
    public String set(int index, String element) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void add(int index, String element) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String remove(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<String> subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException();
    }

    @Override
    protected void removeRange(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(int index, Collection<? extends String> c) {
        throw new UnsupportedOperationException();
    }
}
