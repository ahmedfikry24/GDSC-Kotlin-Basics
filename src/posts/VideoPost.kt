package posts

class VideoPost : BasePost(), Post {

    val videoLink = "www.google.com"

    fun editPost() {

    }

    override var text: String
        get() = ""
        set(value) {}

    override fun editPost(text: String, image: String) {

    }

    override fun getPublisherName() {

    }

}