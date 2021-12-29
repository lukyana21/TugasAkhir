package id.pratama.luky.model

//mendefinisikan data yang akan diambil dari internet
data class Comments (
    val postId : Long = 0,
    val id : Long = 0,
    val name : String = "",
    val email : String = "",
    val body : String = "",
)