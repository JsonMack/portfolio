pipeline {
    agent any
    stages {
        stage('Maven Build') {
            steps {
                sh 'mvn clean -Dspring-boot.run.jvmArguments="spring.config.location=~/website-resources/application-production.yml" spring-boot:run'
            }
        }
    }
}
