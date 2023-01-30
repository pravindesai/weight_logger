package com.gym.logger.weightlogger

import java.text.SimpleDateFormat
import java.util.*

object AppUtil {

    fun getConvertedDate(date: Date?):String{
        return date?.let {
            val format = "dd/mm/yyyy: HH:MM"
            val input = SimpleDateFormat(format, Locale.ENGLISH)
            input.format(date)
        }?:run {
           ""
        }
    }

}