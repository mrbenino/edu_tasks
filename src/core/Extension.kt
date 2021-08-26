package core

fun String.printf(vararg args: Any?) = println(String.format(this, args))