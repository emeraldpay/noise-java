plugins {
    `java-library`
    `maven-publish`

    // Support for the Java 9+ module system, that lets you hide packages.
    id("org.javamodularity.moduleplugin") version "1.5.0"
    // Make JavaDocs link back to the main Java docs.
    id("io.freefair.javadoc-links") version "3.8.4"
}

repositories {
    jcenter()
}

group = "com.southernstorm"
version = "1.0"

java.sourceCompatibility = JavaVersion.VERSION_11
java.targetCompatibility = JavaVersion.VERSION_11

// Would like the resulting JAR to be compiled with lower bytecode version,
// so it still runs fine on Java 8.
modularity.mixedJavaRelease(8)

dependencies {
    // JUnit testing.
    testCompile("org.junit.jupiter:junit-jupiter-api:5.2.0")
    testCompile("org.junit.jupiter:junit-jupiter-params:5.2.0")
    testRuntime("org.junit.jupiter:junit-jupiter-engine:5.2.0")
}

tasks.test {
    useJUnitPlatform()
}
