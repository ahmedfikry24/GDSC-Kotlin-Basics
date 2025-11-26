package design_patterns

class RestaurantAndCafe {
    fun requestOrder(order: Order) {
        val oderBill = calculateBill(order)
        println("Order bill is: $oderBill")
    }

    fun calculateBill(order: Order): Double {
        return order.price + (order.price * TAX_PERCENTAGE / 100)
    }

    companion object {
        const val TAX_PERCENTAGE = 12
    }
}


interface Order {
    val price: Double
}

class BasicOrder : Order {
    override val price: Double
        get() = 50.0
}

abstract class OrderDecorator(private val order: Order) : Order {
    override val price: Double
        get() = order.price
}

class RiceDecorator(private val order: Order) : OrderDecorator(order) {
    override val price: Double
        get() = order.price + 20.0

}

class CoffeeDecorator(private val order: Order) : OrderDecorator(order) {
    override val price: Double
        get() = order.price + 10.0

}

