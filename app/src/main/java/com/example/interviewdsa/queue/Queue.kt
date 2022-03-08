package com.example.interviewdsa.queue

/**
 * There are 4 types of implementations for Queue
 * 1. Array List Based
 * 2. Linked List Based
 * 3. Ring Buffer
 * 4. Two stacks
 */
interface Queue<T> {

    //Insert an element at the back of the queue
    fun enqueue(element: T): Boolean

    //Removes the element at the front of the queue and returns it
    fun dequeue(): T?

    val count: Int

    val isEmpty: Boolean
    get() = count == 0

    //Returns the element at the front of the queue without removing it
    fun peek(): T?
}