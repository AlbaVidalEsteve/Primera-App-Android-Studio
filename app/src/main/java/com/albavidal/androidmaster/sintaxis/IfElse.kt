package com.albavidal.androidmaster

fun main() {
    ifBasic()
    ifAnidado()
    ifBoolean()
    ifInt()
    ifMultiple()
    ifMultipleOr()
}
fun ifMultipleOr(){
    var pet = "dog"
    var isHappy = true
    if(pet== "dog" || (pet== "gat" || isHappy)) {
        println("Es un perro o un gato feliz")
    } else {
        println("Es otro animal")
    }
}

fun ifMultiple(){
    var age = 18
    var parentPermission = false
    var imHappy = true

    if (age >= 18 && parentPermission && imHappy){
        println("Puede beber alcohol")
    }


}

fun ifInt() {
    var age = 29
    if(age >= 18) {
        println("Puede beber alcohol")
    }else {
        println("No puede beber alcohol")
    }

}

fun ifBoolean() {
    var soyFeliz:Boolean = true
    //sin nada == true
    //con ! al principio == false
    if(!soyFeliz) {
        println("No soy feliz")
    } else {
        println("Soy feliz")
    }
}

fun ifAnidado(){
    val animal = "cat"
    if(animal == "dog"){
        println("Es un perrito")
    }
    else if(animal == "cat"){
        println("Es un gato")
    }
    else if(animal == "bird"){
        println("Es un pájaro")
    } else {
        println("No es uno de los animales epserados")
    }
}

fun ifBasic() {
    val name = "Paula"
    // dos iguales compara
    if (name == "Alba") {
        println("Oye, la variable name es Alba")
    } else {
        println("Esta no es Alba")
    }
}