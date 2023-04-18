package com.albavidal.androidmaster

fun main(){
    var name:String? = null //con el interrogante la variable puede tomar valores nulos

    // como puede tomar valores nulos al ejecutar funciones sobre esta variable necesitamos medidas
    // de seguridad para que no salgan errores
    // muchas veces sin estas medidas no se ejecutara el código

    //MEDIDAS DE SEGURIDAD
    //asegurarle que no sera nulo con dos exclamaciones
    //println(name!![0]) //Si aun asi la variable es nula dara error, però esto permite que ejecute la función
    //println(name!!.get(3))
    //decir que sólo se ejecute cuando no tome valores nulos con un interrogante
    // ponemos ?: para que muestre algo en caso que sea nulo
    println(name?.get(3) ?:"Es nulo")
}