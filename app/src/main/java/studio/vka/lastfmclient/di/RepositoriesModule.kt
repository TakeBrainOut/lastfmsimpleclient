package studio.vka.lastfmclient.di

import dagger.Module
import dagger.Provides
import studio.vka.lastfmclient.data.network.ChartApi
import studio.vka.lastfmclient.repositories.chart.ChartRepository
import studio.vka.lastfmclient.repositories.chart.ChartRepositoryImpl
import javax.inject.Singleton

/**
 * Created by Кирилл on 24.06.2017.
 */

@Module
interface RepositoriesModule {

    @Provides
    @Singleton
    fun provideChartRepository(chartApi: ChartApi): ChartRepository = ChartRepositoryImpl(chartApi)

}