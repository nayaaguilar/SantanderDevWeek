package Local

import data.Cliente
import data.Cartao
import data.Conta

class FakeData {
    fun getlocalData(): Conta {
        val cliente = Cliente("Olá! Nayara Aguilar")
        val cartao = Cartao("420")
        return Conta(
            "Cc: 455555-4",
            "Ag: 2255-4",
            "R$ 2.500,00",
            "R$6.200,00",
            cliente,
            cartao
        );
    }
}