plugins {
    kotlin("jvm") version "2.0.10"
}

group = "org.dargenzio"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("org.jsoup:jsoup:1.18.1")
    implementation("commons-validator:commons-validator:1.9.0")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}