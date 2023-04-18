package com.albavidal.androidmaster

fun main(){
    lameGetMonth(5)
    getMonth(6)
    getTrimester(7)
    getSemester(6)
    result(true)
    newGetSemester(7)
}
fun result(value:Any){
    when(value){
        is Int -> value + value
        is String -> println(value)
        is Boolean -> if(value) println("Es verdadero")
    }


}
fun lameGetMonth(month:Int) {
    if(month==1){
        println("Enero")
    } else if(month == 2){
        println("Febrero")
    }else if(month == 3){
        println("Marzo")
    }else if(month == 4){
        println("Abril")
    }else if(month == 5){
        println("Mayo")
    }else if(month == 6){
        println("Junio")
    }else if(month == 7){
        println("Julio")
    }else if(month == 8){
        println("Agosto")
    }else if(month == 9){
        println("Setiembre")
    }else if(month == 10){
        println("Ocutbre")
    }else if(month == 11){
        println("Noviembre")
    }else if(month == 12){
        println("Diciembre")
    } else{
        println("El mes no existe")
    }
}

fun getMonth(month: Int){
    when(month){
        1 -> println("Enero")
        2 -> println("Febrero")
        3 -> println("Marzo")
        4 -> println("Abril")
        5 -> println("Mayo")
        6 -> println("Junio")
        7 -> println("Julio")
        8 -> println("Agosto")
        9 -> println("Septiembre")
        10 -> println("Octubre")
        11 -> {
            println("Noviembre")
            println("Entre llaves para poner mas lineas de código")
        }
        12 -> println("Diciembre")
        else -> println("No es un mes válido")
    }
}

fun getTrimester(month: Int){
    when(month) {
        1, 2, 3 -> println("Primer trimestre")
        4, 5, 6 -> println("Segundo trimestre")
        7, 8, 9 -> println("Tercer trimestre")
        10, 11, 12 -> println("Cuarto trimestre")
        else -> println("No es un mes válido")
    }
}

fun getSemester(month: Int){
    when(month){
        in 1..6 -> println("Primer semestre")
        in 7..12 -> println("Segundo semestre")
        !in 1..12 -> println("semestre no válido")
        //else -> println("semestre no válido")
    }

}

fun newGetSemester(month: Int):String =  when (month) {
        in 1..6 -> "Primer semestre"
        in 7..12 -> "Segundo semestre"
        !in 1..12 -> "semestre no válido"
        else -> "semestre raro"
    }
