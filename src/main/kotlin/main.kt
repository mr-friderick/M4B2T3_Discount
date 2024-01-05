fun main() {
    val amount          = 2000
    val regularСustomer = true
    var discount        = 0

    if (amount >= 1001 && amount <= 10000) {
        discount = 100
    } else if (amount >= 10001) {
        discount = (amount * 0.05).toInt()
    }

    if (regularСustomer) {
        discount += ((amount - discount) * 0.01).toInt()
    }

    println("Сумма заказа: $amount. Скидка составляет: $discount")
}