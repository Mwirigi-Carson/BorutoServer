@file:Suppress("DEPRECATION")

package com.mwirigiCarson.plugins

import com.mwirigiCarson.routes.getAllAllHeroes
import com.mwirigiCarson.routes.root
import com.mwirigiCarson.routes.searchHero
import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        root()
        getAllAllHeroes()
        searchHero()

        static("images") {
            resources("images")
        }
    }
}
