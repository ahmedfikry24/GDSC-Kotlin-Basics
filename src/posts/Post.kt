package posts

open class Post(
    open var publisherName: String
) {

    var isEdited = false
    var likesCount: Int = 0
    var comments = mutableListOf("hi", "hi")

    fun addLike() = likesCount++
    fun removeLike() = likesCount--

    fun addComment(comment: String) = comments.add(comment)

    fun getName() {
        println(publisherName)
    }

    open fun editPost() {
        isEdited = true
    }
}