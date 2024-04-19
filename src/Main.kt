import posts.ImagePost
import posts.Post
import posts.VideoPost

fun main() {
    val myPost = Post("mohamed").toString()
    val friendPost = VideoPost("mohamed").editPost()
}