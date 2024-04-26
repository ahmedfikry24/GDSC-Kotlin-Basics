package posts

abstract class BasePost {

    abstract var text: String


    var likesCount: Int = 0
    var comments = mutableListOf("hi", "hi")

    fun addLike() = likesCount++
    fun removeLike() = likesCount--

    fun addComment(comment: String) = comments.add(comment)

    abstract fun editPost(text: String, image: String)

}