package com.example.interviewdsa.stacks

interface Stack<Element> {

    val count: Int

    val isEmpty: Boolean
        get() = count == 0

    fun push(element: Element)

    fun pop(): Element?

    fun peek(): Element?

}

class StackImpl<T: Any>: Stack<T> {
    private val storage = arrayListOf<T>()

    override fun toString() = buildString {
        appendLine("----top----")
        storage.asReversed().forEach {
            appendLine("$it")
        }
        appendLine("--------")
    }

    override fun push(element: T) {
        storage.add(element)
    }

    override fun pop(): T? {
        if (isEmpty) {
            return null
        }
        return storage.removeAt(storage.size - 1)
    }

    override val count: Int
        get() = storage.size

    override fun peek(): T? {
        return storage.lastOrNull()
    }



    companion object {
        fun <T : Any> create(items: Iterable<T>): Stack<T> {
            val stack = StackImpl<T>()
            for (i in items) {
                stack.push(i)
            }
            return stack
        }

        fun <T: Any> stackOf(vararg elements: T): Stack<T> {
            return create(elements.asList())
        }
    }
}


