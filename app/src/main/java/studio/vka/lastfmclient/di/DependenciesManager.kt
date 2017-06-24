package studio.vka.lastfmclient.di

/**
 * Created by Кирилл on 23.06.2017.
 */

class DependenciesManager {

    companion object {
        val APP_COMPONENT = createComponent()

        private fun createComponent(): AppComponent = DaggerAppComponent.builder()
                .build()
    }

}