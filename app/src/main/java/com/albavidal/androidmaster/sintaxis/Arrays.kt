package com.albavidal.androidmaster

fun main() {
    // Indice (0 a 6)
    val weekDays = arrayOf("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sabado", "Domingo")

    // Tamaño 7 (nº de items)
    println(weekDays.size)
    if (weekDays.size >= 8) {
        println(weekDays[7])
    } else {
        println("No hay valores en el array")
    }

    //Actulaizamos/Modificamos valores del array
    println(weekDays[0])
    weekDays[0] = "Holis"
    println(weekDays[0])

    //Bucles para array (recórrer arrays)
    for (position in weekDays.indices){
        println(weekDays[position])
    }

    for((position,value)in weekDays.withIndex()){
        println("La posición $position contiene $value")
    }

    for(weekDay in weekDays){
        println("Hoy es $weekDay")
    }
}