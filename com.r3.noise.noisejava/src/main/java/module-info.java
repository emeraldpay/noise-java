/**
 * An API for building Noise protocols. Noise protocols are lightweight encrypted stream protocols in which you
 * configure your preferred combination of handshakes, negotiations, modes and ciphers to build a protocol
 * customised for your needs. Thus it isn't an out of the com.r3.noise.box replacement for TLS but can be useful in cases
 * where you don't need or want full TLS compatibility.
 */
@SuppressWarnings({"module", "JavaModuleNaming"})
module com.r3.noise.noisejava {
    exports com.southernstorm.noise.protocol;
    // The c.s.n.crypto package is for internal use only.
    requires org.jetbrains.annotations;
}