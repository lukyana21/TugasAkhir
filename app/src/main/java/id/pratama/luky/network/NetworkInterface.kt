package id.pratama.luky.network

import id.pratama.luky.model.Comments
import retrofit2.http.GET

interface NetworkInterface {

    @GET("/comments")
    suspend fun getComments() : List<Comments>
}