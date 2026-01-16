package org.iesra

class Estudiante(private val nombre: String) {

    var nota : Double = 0.0
        set(value) {
            require(value in 0.0..10.0) {"La nota debe de estar entre 0 y 10"}
            field = value
        }

    override fun toString(): String {
        return "Estudiante $nombre, Nota: $nota"
    }
}