package ru.tech.cookhelper.core.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import ru.tech.cookhelper.data.remote.api.auth.AuthService
import ru.tech.cookhelper.data.remote.api.chat.ChatApi
import ru.tech.cookhelper.data.remote.webSocket.message.MessageService
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Provides
    @Singleton
    fun provideAuthService(
        retrofit: Retrofit
    ): AuthService = retrofit.create(AuthService::class.java)

    @Provides
    @Singleton
    fun provideChatApi(
        retrofit: Retrofit
    ): ChatApi = retrofit.create(ChatApi::class.java)

    @Provides
    @Singleton
    fun provideMessageService(): MessageService = MessageService()

}