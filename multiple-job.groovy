def microservices = ['serviceA', 'serviceB', 'serviceC']
def project = 'MYAPP'

Folder(project) {
    description("My project name is ${project}")
    microservices.each { services ->
        job("${project}-${services}") {
            description("This is my service: ${project}-${services}")
            steps {
                shell("echo My Project is ready : ${project}-${services}")
            }
        }
    }
}

