package edu.touro.mcon264.l5_find_middle;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class SolutionTest {

    @Test
    @DisplayName("Middle of odd list")
    public void testMiddleOddLinkedList() {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        Node middle = list.getMiddle();
        assertEquals(2, middle.getData());
    }

    @Test
    @DisplayName("Middle of equal list returns first of 2 center nodes")
    public void testMiddleEvenLinkedList2() {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        Node middle = list.getMiddle();
        assertEquals(2, middle.getData());
    }

    @Test
    @DisplayName("Empty list middle returns null")
    public void testMiddleEmptyLinkedListIsNull() {
        LinkedList list = new LinkedList();
        Node middle = list.getMiddle();
        assertNull(middle);
    }

    @Test
    @DisplayName("Middle of single item list returns that item")
    public void TestMiddleOfSingleItemListIsThatItem() {
        LinkedList list = new LinkedList();
        list.add(1);
        Node middle = list.getMiddle();
        assertEquals(1, middle.getData());
    }
}