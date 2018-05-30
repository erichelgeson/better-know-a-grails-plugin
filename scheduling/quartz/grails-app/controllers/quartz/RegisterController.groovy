package quartz

class RegisterController {

    def index() {
        SendWelcomeEmailJob.triggerNow(email:"foo@bar.com")
        render 'ok'
    }
}

//curl localhost:8080/register/index