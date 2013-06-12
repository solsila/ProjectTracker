package projecttracker

class ProjectController {

    def beforeInterceptor = [action:this.&auth]
    
    def scaffold=true
	
    def index() {
        redirect(action: "list")
    }
    def auth() {
        if(!session.user) {
            redirect(controller:"Login", action:"login")
            return false
        }
    }
    
}