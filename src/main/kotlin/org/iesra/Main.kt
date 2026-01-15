package org.iesra

fun main() {

    val cuenta = CuentaBancaria("Juan Pérez")

    cuenta.ingresar(100.0)

    println(cuenta)

    cuenta.retirar(50.0)

    println(cuenta)

    try {
        cuenta.retirar(100.0)  // aquí debería saltar la excepción
    } catch (e: Exception) {
        println("Error al retirar: ${e.message}")
    }

    val coche = Vehiculo("Seat", "Ibiza", 0.0)

    println(coche)

    coche.registrarViaje(100.0)

    println(coche)

}
