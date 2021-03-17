package dev.mishkun.disample.utils


class DepRef<in T, out R>(private val resolver: (T) -> R) {
    private val fieldMap = mutableMapOf<T,R>()
    fun get(arg: T): R = fieldMap.getOrPut(arg, { resolver(arg) })
    fun clear(arg: T) = fieldMap.remove(arg)
}
