package io.klibs.util

actual interface Closeable {

  /**
   * Closes this closable resource.
   *
   * Implementations of this method may throw exceptions.
   */
  actual fun close()
}