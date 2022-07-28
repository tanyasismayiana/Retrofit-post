package dev.tanya.myapi

import android.telecom.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiInterface {
    @GET("/posts")
    fun getPost():retrofit2.Call<List<Post>>

    @GET("/posts/{id}")
    fun getPostById(@Path("id")postId:Int):retrofit2.Call<Post>
}
