pipeline {
    agent any
    stages {
        stage('Maven Build') {
            steps {
                sh 'mvn clean -Dspring-boot.run.jvmArguments="-Dspring.config.location=~/website-resources/application-production.yml" spring-boot:run'
            }
        }
    }
}
