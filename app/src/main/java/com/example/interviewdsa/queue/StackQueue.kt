package com.example.interviewdsa.queue

import com.example.interviewdsa.stacks.StackImpl

/**
 *Time Complexity:
 * enqueue - O(1)
 * dequeue - O(1)
 * Space Complexity - O(n)
 */

/*
 This beats the linked list in terms of spatial locality. This is because list elements are next to each other
 in memory blocks. So a large number of elements will be loaded in a cache on first access
 It doesn't have the fixed sized restriction that we have with ring buffer queue

 */
class StackQueue<T : Any>: Queue<T> {

    private val leftStack = StackImpl<T>()
    private val rightStack = StackImpl<T>()

    override val isEmpty: Boolean
        get() = leftStack.isEmpty && rightStack.isEmpty

    override fun enqueue(element: T): Boolean {
        rightStack.push(element)
        return true
    }

    override fun dequeue(): T? {
        if (leftStack.isEmpty) {
            transferElements()
        }
        return leftStack.pop()
    }

    override val count: Int
        get() = TODO("Not yet implemented")

    override fun peek(): T? {
        if(leftStack.isEmpty) {
            transferElements()
        }
        return leftStack.peek()
    }

    private fun transferElements() {
        var nextElement = rightStack.pop()
        while (nextElement != null) {
            leftStack.push(nextElement)
            nextElement = rightStack.pop()
        }
    }

    override fun toString(): String {
        return "Left stack: \n$leftStack \n Right Stack: \n$rightStack"
    }
}


fun main() {

    val queue = StackQueue<String>().apply {
        enqueue("Hrishi")
        enqueue("Divya")
        enqueue("Pehel")
    }
    println(queue)
    queue.dequeue()
    println(queue)
    println("Next up: ${queue.peek()}")
}