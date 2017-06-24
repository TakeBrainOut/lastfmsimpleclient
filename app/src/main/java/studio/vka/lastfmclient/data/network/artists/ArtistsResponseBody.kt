package studio.vka.lastfmclient.data.network.artists

import com.google.gson.annotations.SerializedName

data class ArtistsResponseBody(

        @field:SerializedName("artistsResponse")
        val artistsResponse: ArtistsResponse? = null
)