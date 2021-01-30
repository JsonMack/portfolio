pipeline {
    agent any
    stages {
        stage('Maven Build') {
            steps {
                sh 'mvn clean -Dspring-boot.run.jvmArguments="-Dspring.profiles.active=production" spring-boot:run'
            }
        }
    }
}
