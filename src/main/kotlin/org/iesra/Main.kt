package org.iesra

fun main() {

    val cuenta = CuentaBancaria("Juan Pérez")

    cuenta.ingresar(100.0)

    println(cuenta)

    cuenta.retirar(50.0)

    println(cuenta)

    try {
        cuenta.retirar(100.0)
    } catch (e: Exception) {
        println("Error al retirar: ${e.message}")
    }

    val coche = Vehiculo("Seat", "Ibiza", 0.0)

    println(coche)

    coche.registrarViaje(100.0)

    println(coche)

    val libro = Libro("Hola", "Yo")
    println(libro)

    try {
        val libro2 = Libro("Hola2", "")
    } catch (e: IllegalArgumentException) {
        println("Error al crear libro: ${e.message}")
    }

    val estudiante = Estudiante("Yo")

    estudiante.nota = 7.0

    println(estudiante)

    try {
        val estudiante2 = Estudiante("Juan")

        estudiante2.nota = 11.0
    } catch (e: IllegalArgumentException) {
        println("Error al crear estudiante: ${e.message}")
    }
}
