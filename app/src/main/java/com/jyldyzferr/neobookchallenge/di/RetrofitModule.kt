package com.jyldyzferr.neobookchallenge.di

import com.jyldyzferr.neobookchallenge.data.cloud.network.EcoMarketService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

private const val BASE_URL = "https://neobook.online/ecobak"

@Module
@InstallIn(SingletonComponent::class)
class RetrofitModule {

    @Provides
    fun provideRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(
                OkHttpClient.Builder()
                    .addInterceptor(HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
                    .addInterceptor(Interceptor { chain ->
                        val request = chain.request()
                            .newBuilder()
//                            .addHeader("Authorization", )
                            .build()

                        return@Interceptor chain.proceed(request = request)
                    })
                    .build()
            )
            .build()
    }

    @Provides
    fun provideEcoMarketService(retrofit: Retrofit): EcoMarketService =
        retrofit.create(EcoMarketService::class.java)
}
