Noise Protocol for Java
=======================

This library is a fork of [Rhys Weatherley's Noise-Java library](https://github.com/rweather/noise-java), but
modernised to benefit from newer Java versions. As such it offers the features in the base Noise spec. It doesn't
implement Noise Pipes, NoiseLingoSocket or other newer extensions.
 
Differences from the upstream project include:

* Uses Gradle for the build and JavaDocs.
* Fully modular when used on Java 9+ (has a module-info descriptor)
* Crypto fallbacks have been removed. This version can only use the JDK's native AES/GCM support. This is because
  for users on modern Java the native AES/GCM support is better: it's hardware accelerated using
  AES-NI, and removing emulations and fallback logic makes the library smaller and easier to 
  review. The small size and easy auditability of Noise protocols is one of their primary benefits.
* Updated to more modern Java language constructs (still targets Java 8 runtimes), and fixed various 
  static analysis warnings. Fleshed out a few JavaDocs.
* Added the test vectors from Noise-C and made them run by default as part of `gradle test`.

As a consequence of these changes, this version may be unsuitable for pre-Lollipop Android versions. 
The original might be better if you need to support those cases.