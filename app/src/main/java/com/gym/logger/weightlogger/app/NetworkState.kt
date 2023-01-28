package com.gym.logger.weightlogger.app

sealed class NetworkState<T>(
    val data: T? = null,
    val message: String? = null
) {

    object Empty : NetworkState<Unit>()
    class Loading : NetworkState<Unit>()
    class Success<T>(data: T?=null) : NetworkState<T>(data = data)
    class Failure<T>(message: String?, data: T?=null) : NetworkState<T>(message = message, data = data)
}