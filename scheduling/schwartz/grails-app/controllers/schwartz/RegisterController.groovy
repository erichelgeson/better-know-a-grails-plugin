package schwartz

class RegisterController {

    def emailService

    def index() {
        emailService.triggerJob([email:"foo@bar.com"])
        render 'ok'
    }
}
//curl localhost:8080/register
