package com.mwirigiCarson.repository

import com.mwirigiCarson.models.ApiResponse
import com.mwirigiCarson.models.Hero

class HeroRepositoryImplementation : HeroRepository {
    override val heroes: Map<Int, List<Hero>>
        get() = TODO("Not yet implemented")
    override val page1: List<Hero>
        get() = TODO("Not yet implemented")
    override val page2: List<Hero>
        get() = TODO("Not yet implemented")
    override val page3: List<Hero>
        get() = TODO("Not yet implemented")
    override val page4: List<Hero>
        get() = TODO("Not yet implemented")
    override val page5: List<Hero>
        get() = TODO("Not yet implemented")

    override suspend fun getAllHeroes(page: Int): ApiResponse {
        TODO("Not yet implemented")
    }

    override suspend fun searchHero(name: String): ApiResponse {
        TODO("Not yet implemented")
    }
}