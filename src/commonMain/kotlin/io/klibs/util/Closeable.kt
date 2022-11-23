package io.klibs.util

/**
 * # Closeable Resource
 *
 * Defines a type that wraps or implements a resource which may be closed.
 *
 * @author Elizabeth Paige Harper - https://github.com/foxcapades
 * @since 1.0.0
 */
expect interface Closeable {

  /**
   * Closes this closable resource.
   *
   * Implementations of this method may throw exceptions.
   */
  fun close()
}