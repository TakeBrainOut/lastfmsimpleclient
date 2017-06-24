package studio.vka.lastfmclient.di

import dagger.Module
import dagger.Provides
import studio.vka.lastfmclient.data.network.Api
import studio.vka.lastfmclient.data.network.RetrofitHolder
import javax.inject.Singleton

/**
 * Created by Кирилл on 23.06.2017.
 */

@Module
class ApiModule {

    @Provides
    @Singleton
    fun provideRetrofitHolder(): RetrofitHolder {
        return RetrofitHolder()
    }

    @Provides
    fun provideApi(retrofitHolder: RetrofitHolder): Api {
        return retrofitHolder.api
    }
}