package com.mwirigiCarson

import com.mwirigiCarson.plugins.*
import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*

//fun main(args: Array<String>) {
//    io.ktor.server.netty.EngineMain.main(args)
//}

fun main() {
    embeddedServer(Netty, port = 8080, watchPaths = listOf("classes", "resources")){
        module()
    }.start(wait = true)
}

fun Application.module() {
    configureKoin()
    configureSerialization()
    configureRouting()
    configureMonitoring()
    configureDefaultHeader()
    configureStatusPages()
}
