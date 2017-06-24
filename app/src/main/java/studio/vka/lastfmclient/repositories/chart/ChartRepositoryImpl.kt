package studio.vka.lastfmclient.repositories.chart

import io.reactivex.Single
import studio.vka.lastfmclient.data.network.ChartApi
import studio.vka.lastfmclient.data.network.artists.ArtistsResponseBody

/**
 * Created by Кирилл on 24.06.2017.
 */
class ChartRepositoryImpl(val chartApi: ChartApi) : ChartRepository {

    override fun getArtistsChartList(page: Int): Single<ArtistsResponseBody> = chartApi.getTopArtists(page)
}