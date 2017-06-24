package studio.vka.lastfmclient.data.network.artists

import com.google.gson.annotations.SerializedName

data class ArtistItemResponse(

        @field:SerializedName("image")
        val image: List<ImageItemResponse?>? = null,

        @field:SerializedName("mbid")
        val mbid: String? = null,

        @field:SerializedName("listeners")
        val listeners: String? = null,

        @field:SerializedName("streamable")
        val streamable: String? = null,

        @field:SerializedName("playcount")
        val playcount: String? = null,

        @field:SerializedName("name")
        val name: String? = null,

        @field:SerializedName("url")
        val url: String? = null
)