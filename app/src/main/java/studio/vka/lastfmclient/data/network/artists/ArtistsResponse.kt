package studio.vka.lastfmclient.data.network.artists

import com.google.gson.annotations.SerializedName

data class ArtistsResponse(

        @field:SerializedName("@attr")
        val attr: AttrResponse? = null,

        @field:SerializedName("artist")
        val artist: List<ArtistItemResponse?>? = null
)