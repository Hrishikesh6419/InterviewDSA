package com.example.interviewdsa.linked_list

fun main() {
    /**
     * Basics on how it gets connected
     * This will print 1 -> 2 -> 3
     */
    val node1 = Node(value = 1)
    val node2 = Node(value = 2)
    val node3 = Node(value = 3)

    node1.next = node2
    node2.next = node3

    print(node1)

}