package studio.vka.lastfmclient.di

import dagger.Component
import studio.vka.lastfmclient.MainActivity
import javax.inject.Singleton

/**
 * Created by Кирилл on 23.06.2017.
 */

@Singleton
@Component(modules = arrayOf(ApiModule::class))
interface AppComponent {

    fun inject(mainActivity: MainActivity)
}