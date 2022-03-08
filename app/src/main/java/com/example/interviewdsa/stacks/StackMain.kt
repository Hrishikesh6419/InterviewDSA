package com.example.interviewdsa.stacks

import com.example.interviewdsa.stacks.StackImpl.Companion.stackOf

fun main() {

//    usingAStack()
//    initializeStackUsingList()
    useStackOf()
}

fun usingAStack() {

    //push and print
    val stack = StackImpl<Int>().apply {
        push(1)
        push(2)
        push(3)
        push(4)
    }
    println(stack)

    val poppedElement = stack.pop()
    if (poppedElement != null) {
        println("Popped: $poppedElement")
    }
    println(stack)
}

fun initializeStackUsingList() {
    val list = listOf("A", "B", "C", "D")
    val stack = StackImpl.create(list)
    println(stack)
    println("Popped: ${stack.pop()}")
}

/**
 * This is similar to list of in Kotlin
 */
fun useStackOf() {
    val stack = stackOf("D", "C", "B", "A")
    println(stack)
    println("Popped: ${stack.pop()}")
}