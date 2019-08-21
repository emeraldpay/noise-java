R3 Noise Protocol for Java
==========================

This library is a fork of Rhys Weatherley's Noise-Java library, but modernised to benefit from
newer Java versions. As such it offers the features in the base Noise spec. It doesn't implement
Noise Pipes, NoiseLingoSocket or other newer extensions.
 
Differences from [the upstream project](https://github.com/rweather/noise-java) include:

* Uses Gradle for the build and JavaDocs.
* Uses the Java Platform Module System, so can be used as a modular JAR.
* Can only use the JDK's native AES/GCM support. The fallbacks have been removed. This is because
  for users on modern Java the native AES/GCM support is better: it's hardware accelerated using
  AES-NI, and removing emulations and fallback logic makes the library smaller and easier to 
  review. The small size and easy auditability of Noise protocols is one of their primary benefits.
* Updated to modern Java language constructs and fixed various static analysis warnings. Fleshed out
  a few JavaDocs.
  
As a consequence of these changes, this version may be unsuitable for pre-Lollipop Android versions. 
The original might be better if you need to support those cases.