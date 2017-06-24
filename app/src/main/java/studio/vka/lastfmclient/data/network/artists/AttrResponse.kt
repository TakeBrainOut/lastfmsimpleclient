package studio.vka.lastfmclient.data.network.artists

import com.google.gson.annotations.SerializedName

data class AttrResponse(

        @field:SerializedName("total")
        val total: String? = null,

        @field:SerializedName("perPage")
        val perPage: String? = null,

        @field:SerializedName("totalPages")
        val totalPages: String? = null,

        @field:SerializedName("page")
        val page: String? = null
)