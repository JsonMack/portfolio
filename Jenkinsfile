node {
    stage('Maven Build') {
        buildInfo = rtMaven.run pom: '~/website/pom.xml', goals: 'clean spring-boot:run'
    }
}
