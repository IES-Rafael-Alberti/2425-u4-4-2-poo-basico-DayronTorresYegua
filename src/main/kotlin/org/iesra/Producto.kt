package org.iesra

class Producto(private val nombre : String,
               private var precio : Double,
               private var stock : Int) {

    init {
        require(precio > 0) {"El precio debe de ser positivo"}
        require(stock > 0) {"El stock debe de ser positivo"}
    }

    override fun toString(): String {
        return "Producto: $nombre, Precio: $precio, Stock: $stock"
    }

    fun vender(cantidad : Int) {
        stock -= cantidad
    }

    fun reabastecer(cantidad: Int) {
        stock += cantidad
    }
}