pipeline {
    agent any
    stages {
        stage('Configuration') {
            steps {

            }
        }
        stage('Maven Build') {
            steps {
                sh 'mvn clean -Dspring-boot.run.jvmArguments="-Dspring.profiles.active=production" spring-boot:run'
            }
        }
    }
}
