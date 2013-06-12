package projecttracker

class TaskController {
	
    def beforeInterceptor = [action:this.&auth]
    
    def scaffold=true
	
    def index() {
        redirect(action: "list")
    }
    def auth() {
        if(!session.user) {
            redirect(controller:"EndUser", action:"login")
            return false
        }
    }
}
