import design_patterns.BasicOrder
import design_patterns.CoffeeDecorator
import design_patterns.RestaurantAndCafe
import design_patterns.RiceDecorator

fun main() {
    val restaurant = RestaurantAndCafe()
    val basicOrder = BasicOrder()
    val riceOrder = RiceDecorator(basicOrder)
    val coffeeAndRiceOrder = CoffeeDecorator(riceOrder)

    restaurant.requestOrder(coffeeAndRiceOrder)
}
