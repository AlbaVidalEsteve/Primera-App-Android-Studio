 package com.albavidal.androidmaster.sintaxis


val alba: Person = Person("Alba", 25, "Kotlin", true, "dona")
val robert: Person = Person("Robert", 27, "Japonés", false, "home")

fun main() {
    println(alba.name)
    println(greeting(alba))
    println(greeting(robert))
    println(greeting(Person("Júlia", 22, "Calalà", true, "dona")))
}

data class Person(
    val name: String,
    val age: Int,
    val language: String,
    val happiness: Boolean,
    val sex: String
)


fun greeting(person: Person) : String {
    val happyGreeting = "La ${person.name} té ${person.age} i utilitza ${person.language} "
    val notHappyGreeting = "${person.name} no és feliç "

    return if (person.happiness) {
        happyGreeting + welcome(person)
    } else {
        notHappyGreeting + welcome(person)
    }
}

