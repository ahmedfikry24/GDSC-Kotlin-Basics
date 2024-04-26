package posts

class ImageTextPost(publisherName: String) : BasePost() {

    var imageUrl = "www.google.com"


    fun addImageUrl() {
    }

    fun editPost() {

    }

    override var text: String
        get() = ""
        set(value) {}

    override fun editPost(text: String, image: String) {
        imageUrl = image
    }
}