package com.eightbit.learn.lld.solid.dip.badcode

class NotificationService {

    private var emailService: EmailService = EmailService();

    private var smsService: SmsService = SmsService();

    fun notifyBySMS(msg: String) {
        smsService.sendSms(msg);
    }

    fun notifyByEmail(msg: String) {
        emailService.sendEmail(msg);
    }
}