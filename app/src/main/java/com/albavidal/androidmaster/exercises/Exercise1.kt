package com.albavidal.androidmaster.exercises
/*Notificaciones móviles
Por lo general, el teléfono te proporciona un resumen de las notificaciones.

En el código inicial que se proporciona en el siguiente fragmento de código, escribe un programa que imprima el mensaje de resumen según la cantidad de notificaciones que recibiste. El mensaje debe incluir lo siguiente:

La cantidad exacta de notificaciones cuando haya menos de 100
99+ como cantidad de notificaciones cuando haya 100 o más*/

fun main(){
    val morningNotification = 51
    val eveningNotification = 135
    val pastNotification = -12

    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotification)
    printNotificationSummary(pastNotification)
}

fun printNotificationSummary(numberOfMessages:Int) {

    if(numberOfMessages in 0..99){
        println("You have $numberOfMessages notifications")
    } else if (numberOfMessages>= 100) {
        println("Your phone is blowing up! You have 99+ notifications")
    }else {
        println("That's weird :S")
    }
}
