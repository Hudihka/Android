package com.example.hudihka.myfirstlibrary

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform