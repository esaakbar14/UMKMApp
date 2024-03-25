package id.co.umkmapps.model

import com.google.gson.annotations.SerializedName

data class ResponUser(

        @field:SerializedName("page")
        val page: Int? = null,

        @field:SerializedName("per_page")
        val perpage: Int? = null,

        @field:SerializedName("total")
        val total: Int? = null,

        @field:SerializedName("total_pages")
        val totalpages: Int? = null,

        @field:SerializedName("data")
        val data:List<DataItem>? = null,

)
