pipeline {
    agent none
    stages {
        stage('run all') {
            parallel {
                stage('test') {
                    agent {
                        docker {
                            image 'maven:3.6.3-adoptopenjdk-14'
                        }
                    }
                    steps {
                        sh 'mvn test'
                    }
                }
                stage('build image') {
                    agent {
                        docker {
                            image 'maven:3.6.3-adoptopenjdk-14'
                            args '--network indunetwork'
                        }
                    }
                    steps {
                        configFileProvider(
                        [configFile(fileId: 'indusettings', variable: 'MAVEN_SETTINGS')]) {
                        sh 'mvn -s $MAVEN_SETTINGS clean deploy'
                     }               
                    }
                }
            }
        }
    }
}
