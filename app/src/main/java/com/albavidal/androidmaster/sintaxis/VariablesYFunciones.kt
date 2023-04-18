package com.albavidal.androidmaster

import com.albavidal.androidmaster.sintaxis.Person

val age0:Int = 25
/*
Variables
 */


fun main() {
    showName() //función vacía
    showAge() // función con parámetro de entrada y valor por defecto (opcional)
    add(25,1)
    subtract(10,5) //función con parámetros de salida
    val mySubtract = subtract(10,5)
    println(mySubtract)
    //variablesNumericas()
    //variablesBoolean()
    //variablesAlfanumericas()
}
fun showName() {
    println("Me llamo Alba")
}
fun showAge(age:Int = 100) {
    println("Tengo $age años")
}
fun add(firstNumber:Int, secondNumber:Int) {
    val resultadoSuma = firstNumber + secondNumber
    println(resultadoSuma)
}
fun subtract(firstNumber:Int, secondNumber:Int):Int {
    return firstNumber - secondNumber
    //println("Adiós :(") // --> esto no se va a ejecutar, desde que haces el return va ignorar el código de a continuacion
}
fun subtractCool(firstNumber:Int, secondNumber:Int):Int = firstNumber - secondNumber
    // para funciones pequeñas podemos quitar claves y return y poner un igual
fun variablesNumericas(){
    //Int
            /*(valor entero y real */
    val age1:Int = 25
    var age2:Int = 26
    age2 = 27

    //Long
            /*(variable mas larga que ocupa mas espacio en la memoria podemos ya optimizar la
              memoria poniendo int siempre que sea posible) */
    val longExample:Long = 30
    val longExample2:Long = 30

    //Float//
            /* hay que poner la f al final del decimal */
    val floatExample:Float = 30.5f
    //Double//
            /* como los float pero para mas decimales igual que los long ocupan mas espacio */
    val doubleExample:Double = 50.64654651

    println("Sumar:")
    println(age0 + age2)
    println("Restar:")
    println(age0 - age2)

    println("Multiplicar:")
    println(age0 * age2)

    println("Dividir:")
    println(age0/age2)

    println("Módulo:")
    println(age0 % age2)
}
fun variablesBoolean() {
    val booleanExample1:Boolean = true
    val booleanExample2 = false
}
fun variablesAlfanumericas() {
    //Char (solo soporta un caracter se marca con comillas siples)
    val charExample1:Char = 'e'
    val charExample2:Char = '2'
    val charExample3:Char = '@'

    //String
    //val name = "Alba"
    val stringExample:String = "Hola,"
    val stringExample2 = "bon dia"
    val stringConcatenada = stringExample + stringExample2
    println(stringConcatenada)
    println("$stringExample tengo $age0 años")

    val strungNum1 = "2"
    val stringNum2 ="3"
    println(strungNum1.toInt() + stringNum2.toInt())
}