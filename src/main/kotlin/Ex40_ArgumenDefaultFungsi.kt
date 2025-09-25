package org.example

fun main(args: Array<String>) {
    cunnectToDb()
    println()

    connectToDb("sqlserver", "Zulkifli agus")
}

fun cunnectToDb() {
    TODO("Not yet implemented")
}

fun connectToDb(hostname: String = "localhost",
                username: String = "mysql",
                password: String = "secret") {
    println("hostname : $hostname")
    println("username : $username")
    println("password : $password")
}