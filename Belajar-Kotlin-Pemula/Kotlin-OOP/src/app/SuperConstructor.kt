package src.app

import src.data.ExecutiveCustomer
import src.data.PremiumCustomer

fun main() {
    val premiumCustomer = PremiumCustomer("Mifta")
    println(premiumCustomer.name)

    val executiveCustomer = ExecutiveCustomer("Niam", 100_000_000)
    println(executiveCustomer.name)
    println(executiveCustomer.balance)
}