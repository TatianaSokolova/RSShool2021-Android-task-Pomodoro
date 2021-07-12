package com.rsschool.pomodoro

interface StopwatchListeners {
    fun start(id: Int)

    fun stop(id: Int, currentMs: Long)

    fun reset(id: Int)

    fun delete(id: Int)
}