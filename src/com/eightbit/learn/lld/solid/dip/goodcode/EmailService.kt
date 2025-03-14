package com.eightbit.learn.lld.solid.dip.goodcode

class EmailService : NotificationChannel {
    override fun send(message: String) {
        println("Sending email: $message");
    }
}