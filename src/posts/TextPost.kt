package posts

class TextPost(var publisherName: String) : BasePost() {


    fun getName() {
        println(publisherName)
    }

    override var text: String
        get() = "ahmed text post"
        set(value) {}

    override fun editPost(text: String, image: String) {


    }

}