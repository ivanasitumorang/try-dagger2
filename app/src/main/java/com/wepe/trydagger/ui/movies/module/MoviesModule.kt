package com.wepe.trydagger.ui.movies.module

import com.wepe.trydagger.data.network.ApiService
import com.wepe.trydagger.data.remote.MoviesRepositoryImpl
import com.wepe.trydagger.di.scope.FragmentScope
import com.wepe.trydagger.domain.MoviesDomain
import dagger.Module
import dagger.Provides

@Module
class MoviesModule {
    @Provides
    @FragmentScope
    fun moviesRepository(apiService: ApiService): MoviesRepositoryImpl = MoviesRepositoryImpl(apiService)

    @Provides
    @FragmentScope
    fun moviesDomain(repository: MoviesRepositoryImpl): MoviesDomain = MoviesDomain(repository)
}