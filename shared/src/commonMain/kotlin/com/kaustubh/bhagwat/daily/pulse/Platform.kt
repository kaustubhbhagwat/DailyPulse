package com.kaustubh.bhagwat.daily.pulse

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform