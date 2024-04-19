package posts

class Post(
    age: Int,
    shares: List<String>
) {
    var name: String = "ahmed"
    var likesCount: Int = 0


    var comments = mutableListOf("hi", "hi")

    fun addLike() = likesCount++
    fun removeLike() = likesCount--
    fun addComment() = comments.add("hi")
    fun setName(name: String) {
        this.name = name
        println(name)
    }

}