package com.mwirigiCarson.di

import com.mwirigiCarson.repository.HeroRepository
import com.mwirigiCarson.repository.HeroRepositoryImplementation
import org.koin.dsl.module

val koinModule = module {
    single<HeroRepository> {
        HeroRepositoryImplementation() // this is the class being provided
    }
}