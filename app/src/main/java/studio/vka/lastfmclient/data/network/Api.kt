package studio.vka.lastfmclient.data.network

import io.reactivex.Single
import okhttp3.ResponseBody
import retrofit2.http.GET
import studio.vka.lastfmclient.utils.GlobalConstants

/**
 * Created by Кирилл on 23.06.2017.
 */
interface Api {

    @GET("./?method=chart.gettopartists&format=json&api_key=${ApiConstants.API_KEY}&limit=${GlobalConstants.PAGE_LIMIT}")
    fun getTopArtists(): Single<ResponseBody>

}