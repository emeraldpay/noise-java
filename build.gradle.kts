plugins {
    // Apply the java-library plugin to add support for Java Library
    `java-library`
    id("org.javamodularity.moduleplugin") version "1.5.0"
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