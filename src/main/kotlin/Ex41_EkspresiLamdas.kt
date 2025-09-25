package org.example

fun main(args: Array<String>) {
    println(MyFunction("Rekayasa Perangkat Lunak"))

    val mylamda : (String)->Unit = {s:String-> print(s)}
    val v: String = "Jurusan Teknik Informatika"
    mylamda(v)

    myFun(v,mylamda)
}

fun MyFunction(x: String) : String {
    var c : String = "Hey!! welcome To ---"
    return (c+x)
}
fun myFun(a: String, action: (String)->Unit) {
    print("\nHeyyyy")
    action(a)
}