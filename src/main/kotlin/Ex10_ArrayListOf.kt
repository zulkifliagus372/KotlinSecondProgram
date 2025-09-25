package org.example

fun main(args: Array<String>) {
    val arrayList = arrayListOf(1, 2, 3)
    print("Arraylist Array : ")
    for (item in arrayList) {
        print("$item")
    }
    print("\n")

    arrayList += 9
    print("Tambahkan elemen 9 dalam arrayList : ")
    println(arrayList)

    arrayList.reverse()
    print("Remove Analist : ")
    println(arrayList)

    arrayList -= 1
    print("Remove last element in arrayList : ")
    println(arrayList)

    arrayList += (1..5)
    print("Add range in arrayList : ")
    println(arrayList)
}