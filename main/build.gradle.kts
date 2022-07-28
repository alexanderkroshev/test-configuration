plugins {
    id("ru.sberbank.uvz3.gradle.kotlin-spring-app")
}

dependencies {
    implementation(project(":config"))
    implementation("org.springframework.boot", "spring-boot-starter-web")
}
