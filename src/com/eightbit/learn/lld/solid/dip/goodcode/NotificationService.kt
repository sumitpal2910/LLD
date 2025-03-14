package com.eightbit.learn.lld.solid.dip.goodcode

class NotificationService {

    private val notificationChannel: NotificationChannel;

    constructor(notificationChannel: NotificationChannel) {
        this.notificationChannel = notificationChannel;
    }

    fun notify(message: String) {
        notificationChannel.send(message);
    }
}