plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation("com.fasterxml.jackson.core:jackson-databind:2.16.1")
//    testImplementation("io.rest-assured:rest-assured: 5.4.0")
    implementation("org.postgresql:postgresql:42.7.1")
    implementation("com.codeborne:selenide:7.1.0")


}

tasks.test {
    useJUnitPlatform()
}