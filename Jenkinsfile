pipeline {
    agent any
    stages {
        stage('Maven Build') {
            steps {
                sh 'mvn clean spring-boot:run'
            }
        }
    }
}
