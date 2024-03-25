package id.co.umkmapps.model

import android.provider.ContactsContract.CommonDataKinds.Email
import com.google.gson.annotations.SerializedName

data class DataItem(

        @field:SerializedName("id")
        val id: Int? = null,

        @field:SerializedName("email")
        val Email: String? = null,

        @field:SerializedName("first_name")
        val firstName: String? = null,

        @field:SerializedName("last_name")
        val lastName: String? = null,

        @field:SerializedName("avatar")
        val avatar: String? = null,




)
