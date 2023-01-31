import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("io.realm.kotlin") version "1.5.0"
    kotlin("jvm") version "1.7.21"
    kotlin("plugin.serialization") version "1.6.10"
}

group = "me.sjo"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven ( "https://jitpack.io" )
}

dependencies {
    implementation("junit:junit:4.13.1")
    implementation("junit:junit:4.13.1")
    implementation("org.junit.jupiter:junit-jupiter:5.7.0")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.3.2")
    implementation("io.ktor:ktor-client-core:1.6.7")
    implementation("io.ktor:ktor-client-cio:1.6.7")
    implementation("io.ktor:ktor-client-serialization:1.6.7")
    implementation("org.xerial:sqlite-jdbc:3.36.0.3")
    implementation("io.github.pdvrieze.xmlutil:core-jvm:0.84.2")
    implementation("io.github.pdvrieze.xmlutil:serialization-jvm:0.84.2")
    implementation("io.github.kotlin-telegram-bot.kotlin-telegram-bot:telegram:6.0.7")
    implementation("org.jetbrains.exposed:exposed-core:0.40.1")
    implementation("org.jetbrains.exposed:exposed-dao:0.40.1")
    implementation("org.jetbrains.exposed:exposed-jdbc:0.40.1")
    implementation("com.h2database:h2:2.1.214")
    implementation("org.slf4j:slf4j-api:2.0.3")
    implementation("org.slf4j:slf4j-jdk14:2.0.3")
    implementation("org.postgresql:postgresql:42.2.2")
    implementation("org.mongodb:mongodb-driver-sync:4.7.1")
    implementation("io.realm.kotlin:library-sync:1.5.0")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.0")
    testImplementation(kotlin("test"))
}


tasks.test {
    useJUnit()
}

tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "1.8"
}