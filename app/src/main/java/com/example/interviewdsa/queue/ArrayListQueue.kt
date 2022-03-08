package com.example.interviewdsa.queue

import com.example.interviewdsa.queue.Queue


/**
 *Time Complexity:
 * enqueue - O(1)
 * dequeue - O(n)
 * Space Complexity - O(n)
 */
class ArrayListQueue<T>: Queue<T> {
    private val list = arrayListOf<T>()

    override fun enqueue(element: T): Boolean {
        list.add(element)
        return true
    }

    override fun dequeue(): T? = if (isEmpty) null else list.removeAt(0)

    override val count: Int
        get() = list.size

    override fun peek(): T? = list.getOrNull(0)

    override fun toString(): String = list.toString()
}

fun main() {

    val queue = ArrayListQueue<String>().apply {
        enqueue("Hrishi")
        enqueue("Divya")
        enqueue("Pehel")
    }

    println(queue)
    queue.dequeue()
    println(queue)
    println("Next up: ${queue.peek()}")
}