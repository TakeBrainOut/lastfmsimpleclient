package studio.vka.lastfmclient.repositories.chart

import io.reactivex.Single
import studio.vka.lastfmclient.data.network.artists.ArtistsResponseBody

/**
 * Created by Кирилл on 24.06.2017.
 */
interface ChartRepository {

    fun getArtistsChartList(page: Int): Single<ArtistsResponseBody>

}