package org.iesra

class Libro(private val titulo: String,
    private val autor : String,
    private val numPaginas : Int = 100,
    private var leido : Boolean = false) {


    init {
        require(titulo.isNotBlank()) {"El titulo no puede estar vacio"}
        require(autor.isNotBlank()) {"Autor no puede estar vacio"}
        require(numPaginas > 0 && numPaginas <= 5000)
    }

    override fun toString(): String {
        return "Libro: $titulo por $autor, Páginas: $numPaginas, Leidos: $leido"
    }

}