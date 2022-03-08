package com.example.interviewdsa.queue

import java.util.*

/**
 *Time Complexity:
 * enqueue - O(1)
 * dequeue - O(1)
 * Space Complexity - O(n)
 */
class LinkedListQueue<T>: Queue<T> {

    private val list = LinkedList<T>()

    private var size = 0

    override fun enqueue(element: T): Boolean {
        list.add(element)
        size++
        return true
    }

    override fun dequeue(): T? {
        val firstNode = list.first ?: return null
        size--
        list.remove(firstNode)
        return firstNode
    }

    override val count: Int
        get() = size

    override fun peek(): T? = list.first

    override fun toString(): String = list.toString()
}

fun main() {

    val queue = LinkedListQueue<String>().apply {
        enqueue("Hrishi")
        enqueue("Divya")
        enqueue("Pehel")
    }
    println(queue)
    queue.dequeue()
    println(queue)
    println("Next up: ${queue.peek()}")
}