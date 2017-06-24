package studio.vka.lastfmclient.data.network

import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query
import studio.vka.lastfmclient.data.network.artists.ArtistsResponseBody
import studio.vka.lastfmclient.utils.GlobalConstants

/**
 * Created by Кирилл on 23.06.2017.
 */
interface ChartApi {

    @GET("./?method=chart.gettopartists&format=json&api_key=${ApiConstants.API_KEY}&limit=${GlobalConstants.PAGE_LIMIT}")
    fun getTopArtists(@Query("page") page: Int): Single<ArtistsResponseBody>

}