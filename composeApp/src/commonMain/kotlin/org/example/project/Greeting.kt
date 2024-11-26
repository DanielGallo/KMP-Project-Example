package org.example.project

class Greeting {
    internal val platform = getPlatform()

    fun greet(): String {
        return "Hello, ${platform.name}!"
    }
}