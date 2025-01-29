package com.example.demo.application;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LinkedListManagerTest {

    LinkedListManager list;

    @BeforeEach
    public void prepare()
    {
        list = new LinkedListManager();
    }

    @Test
    public void emptyList_size_returns0()
    {
        assertEquals(0, list.size());
    }

    @Test
    public void listWithOneElement_size_returns1()
    {
        list.addAtIndex("ABC", 0);
        assertEquals(1, list.size());
    }

    @Test
    public void emptyList_addAtIndex0returnsTrue()
    {
        assertTrue(list.addAtIndex("ABC", 0));
    }

    @Test
    public void list_addAtIllegalIndexreturnsFalse()
    {
        list.addAtIndex("ABC", 0);
        assertFalse(list.addAtIndex("ABC", 2));
        assertFalse(list.addAtIndex("ABC", -1));
    }

    @Test
    public void emptyList_getAtIllegalIndex_throwsException()
    {
        Exception exception = assertThrows(Exception.class, () -> list.getAtIndex(5));
        assertEquals("Bad Index", exception.getMessage());
    }

    @Test
    public void emptyList_addAtIndex0_worksCorrectly() throws Exception
    {
        assertTrue(list.addAtIndex("ABC", 0));
        assertEquals(1, list.size());
        assertEquals("ABC", list.getAtIndex(0));
        assertEquals("[ABC,]", list.toString());

    }

    @Test
    public void emptyList_addAtVariousIndexes_worksCorrectly() throws Exception
    {
        assertTrue(list.addAtIndex("A", 0));
        assertTrue(list.addAtIndex("B", 1));
        assertTrue(list.addAtIndex("C", 1));
        assertTrue(list.addAtIndex("D", 2));
        assertTrue(list.addAtIndex("E", 0));
        assertEquals(5, list.size());
        assertEquals("E", list.getAtIndex(0));
        assertEquals("[E,A,C,D,B,]", list.toString());

    }
}
