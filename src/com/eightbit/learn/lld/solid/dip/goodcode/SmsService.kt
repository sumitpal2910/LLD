package com.eightbit.learn.lld.solid.dip.goodcode

class SmsService : NotificationChannel {
    override fun send(message: String) {
        println("Sending SMS: $message");
    }
}