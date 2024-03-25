package id.co.umkmapps.network

import id.co.umkmapps.model.ResponUser
import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.Call
import retrofit2.http.*

interface ApiService {

    @GET("api/users")
    fun getListUsers(@Query("page") page: String): Call<ResponUser>

    @GET("api/users/{id}")
    fun getUser(@Path("id") id: String): Call<ResponUser>

    @FormUrlEncoded
    @POST("api/user")
    fun createUser(
            @Field("Name") name: String,
            @Field("Job") job: String ): Call<ResponUser>


    @Multipart
    @PUT("api/uploadfile")
    fun updateUser(
            @Part file: MultipartBody.Part,
            @PartMap data: Map<String, RequestBody>
    ): Call<ResponUser>
}
