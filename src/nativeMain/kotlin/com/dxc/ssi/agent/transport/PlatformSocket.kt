package com.dxc.ssi.agent.transport

internal actual class PlatformSocket actual constructor(url: String) {
    actual fun openSocket(listener: PlatformSocketListener) {
    }

    actual fun closeSocket(code: Int, reason: String) {
    }

    actual fun sendMessage(msg: String) {
    }
}