package com.example.interviewdsa.linked_list

fun main() {

//    normalPush()
//    fluentInterfacePush()
//    normalAppend()
//    insertAtParticularNode()
//    popFromFront()
//    removeLastNode()
    removeAtParticularNode()
}

fun normalPush() {
    val list = LinkedList<Int>()
    list.push(3)
    list.push(2)
    list.push(1)
    println(list)
}

fun fluentInterfacePush() {
    val list = LinkedList<Int>()
    list.push(3).push(2).push(1)
    println(list)
}

fun normalAppend() {
    val list = LinkedList<Int>()
    list.append(1)
    list.append(2)
    list.append(3)
    println(list)
}

fun insertAtParticularNode() {
    val list = LinkedList<Int>()
    list.push(3)
    list.push(2)
    list.push(1)

    println("Before Inserting: $list")
    var middleNode = list.nodeAt(1)!!

    for (i in 1..3) {
        middleNode = list.insert(-1*i, middleNode)
    }

    print("After inserting: $list")
}

fun popFromFront() {
    val list = LinkedList<Int>()
    list.push(3)
    list.push(2)
    list.push(1)

    println("Before popping list: $list")
    var poppedValue1 = list.pop()
    println("After popping list poppedValue1: $poppedValue1")
    println("Popped value: $poppedValue1")
    var poppedValue2 = list.pop()
    println("After popping list poppedValue2: $poppedValue2")
    println("Popped value: $poppedValue2")
    var poppedValue3 = list.pop()
    println("After popping list poppedValue3: $poppedValue3")
    println("Popped value: $poppedValue3")
    var poppedValue4 = list.pop()
    println("After popping list poppedValue3: $poppedValue4")
    println("Popped value: $poppedValue4")
}

fun removeLastNode() {
    val list = LinkedList<Int>()
    list.push(3)
    list.push(2)
    list.push(1)

    println("Before popping list: $list")
    val removedLast = list.removeLast()
    println("After popping list removedLast: $removedLast")
    println("Popped value: $removedLast")

    println("Before popping list: $list")
    val removedLast1 = list.removeLast()
    println("After popping list removedLast1: $removedLast1")
    println("Popped value: $removedLast1")

    println("Before popping list: $list")
    val removedLast2 = list.removeLast()
    println("After popping list removedLast2: $removedLast2")
    println("Popped value: $removedLast2")

    println("Before popping list: $list")
    val removedLast3 = list.removeLast()
    println("After popping list removedLast3: $removedLast3")
    println("Popped value: $removedLast3")
}

fun removeAtParticularNode() {
    val list = LinkedList<Int>()
    list.push(3)
    list.push(2)
    list.push(1)

    println("Before removing at a particular index: $list")
    val index = 1
    val node = list.nodeAt(index - 1)!!
    val removedValue = list.removeAfter(node)
    println("After removing at index $index: $list")
    println("Removed value: $removedValue")
}

