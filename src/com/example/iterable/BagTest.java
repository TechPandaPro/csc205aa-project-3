package com.example.iterable;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;

import static org.junit.jupiter.api.Assertions.*;

class BagTest {

    @Test
    void isEmpty() {
        Container<String> fruitsBag = new Bag<String>();
        fruitsBag.add("apple");
        fruitsBag.add("orange");
        fruitsBag.add("banana");
        fruitsBag.add("pear");

        boolean expected = false;
        boolean actual = fruitsBag.isEmpty();

        assertEquals(expected, actual);
    }

    @Test
    void size() {
        Container<String> fruitsBag = new Bag<String>();
        fruitsBag.add("apple");
        fruitsBag.add("orange");
        fruitsBag.add("banana");
        fruitsBag.add("pear");

        int expected = 4;
        int actual = fruitsBag.size();

        assertEquals(expected, actual);
    }

    @Test
    void add() {
        Container<String> fruitsBag = new Bag<String>();
        fruitsBag.add("apple");
        fruitsBag.add("orange");
        fruitsBag.add("banana");
        fruitsBag.add("pear");

        String expected = "Bag{items=[apple, orange, banana, pear]}";
        String actual = fruitsBag.toString();

        assertEquals(expected, actual);
    }

    @Test
    void iterator() {
        Container<String> fruitsBag = new Bag<String>();
        fruitsBag.add("apple");
        fruitsBag.add("orange");
        fruitsBag.add("banana");
        fruitsBag.add("pear");

        Iterator<String> fruitsIterator = fruitsBag.iterator();

        String expected = "apple";
        String actual = fruitsIterator.next();

        assertEquals(expected, actual);
    }

    @Test
    void forEach() {
        Container<String> fruitsBag = new Bag<String>();
        fruitsBag.add("apple");
        fruitsBag.add("orange");
        fruitsBag.add("banana");
        fruitsBag.add("pear");

        List<String> fruitsList = new ArrayList<String>();
        fruitsBag.forEach(fruitsList::add);

        String expected = "[apple, orange, banana, pear]";
        String actual = fruitsList.toString();

        assertEquals(expected, actual);
    }

    @Test
    void spliterator() {
        Container<String> fruitsBag = new Bag<String>();
        fruitsBag.add("apple");
        fruitsBag.add("orange");
        fruitsBag.add("banana");
        fruitsBag.add("pear");

        Spliterator<String> fruits = fruitsBag.spliterator();

        List<String> fruitsList = new ArrayList<String>();
        fruits.forEachRemaining(fruitsList::add);

        String expected = "[apple, orange, banana, pear]";
        String actual = fruitsList.toString();

        assertEquals(expected, actual);
    }

    @Test
    void bagToString() {
        Container<String> fruitsBag = new Bag<String>();

        String expected = "Bag{items=[]}";
        String actual = fruitsBag.toString();

        assertEquals(expected, actual);
    }
}