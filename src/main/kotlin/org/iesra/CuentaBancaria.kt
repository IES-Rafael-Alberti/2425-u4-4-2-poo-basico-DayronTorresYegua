package org.iesra

class CuentaBancaria(private var titular: String, private var saldo: Double = 0.0) {

    fun ingresar(cantidad: Double) {

        saldo += cantidad

    }

    fun retirar(cantidad: Double) {

        saldo -= cantidad

        if (cantidad > saldo) {
            throw Exception("No puede retirar mas dinero que saldo hay en la cuenta")
        }
    }

    override fun toString(): String {
        return "CuentaBancaria(titular='$titular', saldo=$saldo)"
    }
}