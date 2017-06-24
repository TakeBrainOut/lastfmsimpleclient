package studio.vka.lastfmclient.data.network.artists

import com.google.gson.annotations.SerializedName

data class ImageItemResponse(

        @field:SerializedName("#text")
        val text: String? = null,

        @field:SerializedName("size")
        val size: String? = null
)