package com.albavidal.androidmaster.sintaxis

fun welcome(person:Person): String {
    return if (person.sex == "dona") {
        "Benvinguda"
    } else {
        "Benvingut"
    }
}