package com.gym.logger.weightlogger.app

sealed class NetworkState<T>(
    val data: List<T>? = null,
    val message: String? = null
) {

    class Empty<T> : NetworkState<T>()
    class Loading<T> : NetworkState<T>()
    class Success<T>(data: List<T>?=null) : NetworkState<T>(data = data)
    class Failure<T>(message: String?=null, data: List<T>?=null) : NetworkState<T>(message = message, data = data)
}