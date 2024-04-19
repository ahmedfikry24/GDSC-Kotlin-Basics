package posts

class ImagePost(publisherName: String) : Post(publisherName) {

    val imageUrl = "www.google.com"


    fun addImageUrl() {
        addComment("ahmed")
    }

    override fun editPost() {
        super.editPost()
        println("mohamed")
    }
}