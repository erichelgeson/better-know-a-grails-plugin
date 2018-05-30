package quartz


class SendWelcomeEmailJob {

    static triggers = {
        // triggers not required!
    }

    void execute(context) {
        String email =  context.mergedJobDataMap.email
        println "Sending email to $email"
    }
}