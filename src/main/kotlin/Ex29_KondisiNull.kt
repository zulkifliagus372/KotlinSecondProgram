package org.example

fun main(args: Array<String>) {
    var maybeNumber: Int? = 15
    if (maybeNumber != null)
        println(maybeNumber * 2)
    else
        println("The entered value isn't a number")
}