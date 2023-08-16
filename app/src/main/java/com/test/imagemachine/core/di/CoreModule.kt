package com.test.imagemachine.core.di

import android.content.Context
import androidx.room.Room
import com.test.imagemachine.core.data.local.dao.ImageMachineDao
import com.test.imagemachine.core.data.local.room.ImageMachineDb
import com.test.imagemachine.core.data.repository.RepositoryImpl
import com.test.imagemachine.core.domain.repository.Repository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object CoreModule {
    @Provides
    fun provideAppDatabase(@ApplicationContext appContext: Context): ImageMachineDb =
        Room.databaseBuilder(appContext, ImageMachineDb::class.java, "myAccount.db").build()

    @Provides
    fun provideDao(db: ImageMachineDb) = db.imageMachineDao()

    @Provides
    @Singleton
    fun provideRepo(dao: ImageMachineDao): Repository = RepositoryImpl(dao)
}