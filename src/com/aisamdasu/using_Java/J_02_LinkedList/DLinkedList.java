package com.aisamdasu.using_Java.J_02_LinkedList;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Spliterator;
import java.util.function.Consumer;

public class DLinkedList<E> implements List<E> {
    private int size;
    private Node<E> head;
    private Node<E> tail;

    private class Node<E> {
		private Node<E> next;
		private Node<E> prev;
		private E data;

		private Node(E element) {
			this.data = element;
			this.next = null;
			this.prev = null;
		}
	}
    // 오버플로우, 언더플로우 감지, 범위 포함
    private void checkBoundInclusive(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }
    // 오버플로우, 언더플로우 감지, 범위 미포함
    private void checkBoundExclusive(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }

    @Override
    public Spliterator<E> spliterator() {
        return List.super.spliterator();
    }

    @Override
    public void forEach(Consumer<? super E> action) {
        List.super.forEach(action);
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            private Node<E> pos = head;

            @Override
            public boolean hasNext() {
                // TODO Auto-generated method stub
                return (pos != null);
            }

            @Override
            public E next() {
                // TODO Auto-generated method stub
                if (pos == null)
                    throw new NoSuchElementException();
                E data = pos.data;
                pos = pos.next;
                return data;
            }

        };
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void removeAll() {
        Node<E> x = head;

	    while( x != null ){
	       Node<E> next = x.next;
	       x.next = null;
	       x.prev = null;
	       x = next;
	    }
	    head = null;
	    tail = null;
	    size = 0;
    }

    @Override
    public E remove(int index) {
        checkBoundExclusive(index);
		Node<E> x = head;
		for(int i=0; i < index; i++) {
			x = x.next;
		}

		if(index == 0) {
			if(size == 1) {
				head = null;
				tail = null;
			}else {
				x.next.prev = x.prev;
				head = x.next;
			}
		}else if(x == tail) {
			x.prev.next = x.next;
			tail = x.prev;
		}else {
			x.prev.next = x.next;
			x.next.prev = x.prev;
		}
		size--;
		return x.data;
    }

    @Override
    public E get(int index) {
        checkBoundExclusive(index);
        Node<E> node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node.data;
    }

     @Override
    public void add(int index, E element) {
        checkBoundExclusive(index);
		if(index == size) {
			add(element);
			return;
		}

		Node<E> newNode = new Node<>(element);

		Node<E> x = head;
		for(int i=0; i < index; i++) {
			x = x.next;
		}

		if(index == 0) {
			newNode.prev = x.prev;
			x.prev = newNode;
			newNode.next = x;
			head = newNode;
		}else {
			x.prev.next = newNode;
			newNode.prev = x.prev;
			newNode.next = x;
			x.prev = newNode;
		}

		size++;
     }


    @Override
    public void add(E element) {
        Node<E> newNode = new Node<E>(element);

		if(head == null) {
			head = tail = newNode;
		}else {
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
		}
		size++;
    }
}
