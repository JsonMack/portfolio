pipeline {
    tools {
        jdk
    }
    stages {
        stage('Maven Build') {
            steps {
                sh 'mvn clean spring-boot:run'
            }
        }
    }
}
