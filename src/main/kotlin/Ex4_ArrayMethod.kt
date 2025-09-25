package org.example

fun main(args: Array<String>) {
    val simpsonA = arrayOf("Homer", "Marge", "Bart", "Lisa", "Meggie")
    simpsonA.sort()
    for (simpson in simpsonA) {
        print(simpson + ' ')
    }
    print('\n')

    val simpsonB: Array<String> = arrayOf("Homer", "Marge", "Bart", "Lisa", "Meggie")
    val simpsons_sorted = simpsonB.sortedArray()
    for (simpson in simpsonA) {
        print(simpson + ' ')
    }
    print('\n')

    val simpsonC: Array<String> = arrayOf("Homer", "Marge", "Bart", "Lisa", "Meggie")
    simpsonC.sort()
    simpsonC.reverse()
    for (simpson in simpsonC) {
        print(simpson + ' ')
    }
    print('\n')

    val simpsonD = arrayOf("Homer", "Marge", "Bart", "Lisa", "Meggie")
    val simpson = "Lisa"
    val position = simpsonD.indexOf(simpson)
    if (position != -1) {
        println("Yeah, that's my number ${position + 1} Simpson!")
    } else {
        println("Hey that's not Simpson!")
    }

    val simpsonE = arrayOf("Homer", "Marge", "Bart", "Lisa", "Meggie")
    println("simpsons size: " + simpsonE.size)
    if (!simpsonE.isEmpty())
        println("Array tidak kosong!")
    println("Min = " + simpsonE.min())
    println("Max = " + simpsonE.max())
    println("First = " + simpsonE.first())
    println("Last = " + simpsonE.last())
    println(simpsonE.contains("Marge"))
}