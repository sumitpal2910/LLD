package com.eightbit.learn.lld.solid.dip.goodcode

fun main() {
    val emailService: NotificationChannel = EmailService();
    val smsService: NotificationChannel = SmsService();

    val smsNotificationService: NotificationService = NotificationService(smsService);
    val emailNotificationService: NotificationService = NotificationService(emailService);

    smsNotificationService.notify("OTP 1234");
    emailNotificationService.notify("OTP 1234");


}