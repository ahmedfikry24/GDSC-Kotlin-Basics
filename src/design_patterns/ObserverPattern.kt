package design_patterns

interface Observable<T> {
   val observers: MutableList<Observer<T>>
    fun addObserver(observer: Observer<T>)
    fun removeObserver(observer: Observer<T>)
    fun notifyObservers(state: T)
}

class NewsAgency : Observable<String> {
    override val observers: MutableList<Observer<String>> = mutableListOf()

    override fun addObserver(observer: Observer<String>) {
        observers.add(observer)
    }

    override fun removeObserver(observer: Observer<String>) {
        observers.remove(observer)
    }

    override fun notifyObservers(state: String) {
        observers.forEach { it.update(state) }
    }
}


interface Observer<T> {
    fun update(state: T)
}


class NewsSubscribers() : Observer<String> {
    override fun update(state: String) {
        println("Breaking News: $state")
    }
}