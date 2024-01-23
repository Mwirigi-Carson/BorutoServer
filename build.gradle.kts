
val ktorVersion: String by project
val kotlinVersion: String by project
val logbackVersion: String by project
val koinVersion : String by project

plugins {
    kotlin("jvm") version "1.9.22"
    id("io.ktor.plugin") version "2.3.7"
    id("org.jetbrains.kotlin.plugin.serialization") version "1.9.22"
}

group = "com.mwirigiCarson"
version = "0.0.1"

application {
    mainClass.set("io.ktor.server.netty.EngineMain")
    applicationDefaultJvmArgs = listOf("-Dio.ktor.development = true")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.ktor:ktor-server-content-negotiation-jvm")
    implementation("io.ktor:ktor-server-core-jvm")
    implementation("io.ktor:ktor-serialization-kotlinx-json-jvm")
    implementation("io.ktor:ktor-server-netty-jvm")
    implementation("ch.qos.logback:logback-classic:$logbackVersion")
    implementation("io.ktor:ktor-server-call-logging:$ktorVersion")
    testImplementation("io.ktor:ktor-server-tests-jvm")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:$kotlinVersion")

//    KOIN
    implementation ("io.insert-koin:koin-ktor:$koinVersion")
    implementation ("io.insert-koin:koin-logger-slf4j:$koinVersion")

//    Default Headers
    implementation("io.ktor:ktor-server-default-headers:$ktorVersion")

//    Status Pages
    implementation("io.ktor:ktor-server-status-pages:$ktorVersion")
}
