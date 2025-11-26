import design_patterns.NewsAgency
import design_patterns.NewsSubscribers

fun main() {
    val newsAgency = NewsAgency()
    val subscriber1 = NewsSubscribers()
    val subscriber2 = NewsSubscribers()

    newsAgency.addObserver(subscriber1)
    newsAgency.addObserver(subscriber2)

    newsAgency.notifyObservers("New Kotlin version released!")
}
