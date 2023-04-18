package com.albavidal.androidmaster

fun main(){
    inmutableList()
    mutableList()
}
fun mutableList(){
    var weekDays:MutableList<String> = mutableListOf("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo")
    //Podemos añadir valores
    weekDays.add("AristiDay")
    println(weekDays)

    //Podemos añadirlos en la posicion que queremos
    weekDays.add(index = 0, "Aristiday")

    //recorrer
    weekDays.forEach { println(it)  }
    //recorrer combrobando si esta empty (3 formas)
    //Primera
    if (weekDays.isEmpty()){
        //Si esta bacia no hacemos nada
    }else{
        weekDays.forEach{println(it)}
    }
    // Segunda
    if (weekDays.isNotEmpty()){
        weekDays.forEach { println(it) }
    }
    // Tercera
    if (weekDays.isNotEmpty()) {
        for (it in weekDays) {
            println(it)
        }
    }
    //filtrar como siempre
    println(weekDays.filter { it.contains("a") })

    println(weekDays.last())
}
fun inmutableList(){
    val readOnly:List<String> = listOf("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo")
    //ver los indides
    println(readOnly.indices)
    //No podemos cambiar los valores de la lista (por defecto listOf() crea listas no mutables)
    // readOnly[0] = "Holis"  //por eso esto da error
    //Tamaño
    println(readOnly.size)
    // Muestra todo
    println(readOnly.toString())
    //que es lo mismo que sin el to string
    println(readOnly)
    //buscar por indice
    println(readOnly[0])

    //mostras valores concretos
    println(readOnly.last())
    println(readOnly.first())

    //filtrar
    println(readOnly.filter { it.contains("a") })
    val diasConA = readOnly.filter { it.contains("a") }
    println(diasConA)

    //recorrer
    readOnly.forEach { println(it) }
    readOnly.forEach { weekDay ->println(weekDay) } /* si no queremos usar it podemos ponerle otro nombre */

}