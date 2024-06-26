package com.mwirigiCarson.routes

import com.mwirigiCarson.models.ApiResponse
import com.mwirigiCarson.repository.HeroRepository
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject

fun Route.getAllAllHeroes(){

    val heroRepository : HeroRepository by inject<HeroRepository> ()

    get("boruto/heroes"){
        try {
            val page = call.request.queryParameters["page"]?.toInt() ?: 1
            require(page in 1..5)

            val apiResponse = heroRepository.getAllHeroes(page = page)

            call.respond(message = apiResponse, status = HttpStatusCode.OK)
        } catch (e : NumberFormatException){
            call.respond(
                message = ApiResponse(
                success = false,
                message = "Number only allowed"
            ), status = HttpStatusCode.BadRequest)
        } catch (e:IllegalArgumentException){
            call.respond(
                message = ApiResponse(
                    success = false,
                    message = "Heroes Not Found"
                ), status = HttpStatusCode.NotFound
            )
        }
    }
}