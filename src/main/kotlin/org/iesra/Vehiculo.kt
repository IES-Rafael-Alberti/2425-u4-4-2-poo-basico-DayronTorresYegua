package org.iesra

class Vehiculo(private val marca: String,
               private val modelo: String,
               private var kilometraje: Double) {

    fun registrarViaje(kilometros: Double) {
        kilometraje += kilometros
    }

    override fun toString(): String {
        return "Marca: $marca, modelo: $modelo, kilometraje: $kilometraje"
    }
}