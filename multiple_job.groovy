def microservices = ['serviceA', 'serviceB', 'serviceC']
def project = 'MYAPP'

folder(project) {
    description("My project name is ${project}")
    microservices.each { services ->
        job("${project}/${project}-${service}") {
            description("This is my service: ${project}-${services}")
            scm{
                git {
                    remote{
                        url('https://github.com/Sagar-Soin/Jenkins-dsl-testing.git')
                    }
                    branches('*/master')
                }
            }
            steps {
                shell("echo My Project is ready : ${project}-${services}")
            }
        }
    }
}



