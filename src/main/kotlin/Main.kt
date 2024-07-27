package ru.netology

fun main() {
    val amount = 10000 // сумма перевода в рублях
    val commissionRate = 0.0075 // 0.75%
    val minCommission = 35 // минимальная комиссия

    var commission = amount * commissionRate
    if (commission < minCommission) {
        commission = minCommission.toDouble()
    }

    println("Размер комиссии: $commission рублей")
}