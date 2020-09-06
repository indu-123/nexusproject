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
                        // jenkins overwrites /usr/bin/mvn, 
                        // so we need to access the tool directly, 
                        // instead of using the link /usr/bin/mvn
                        sh '/usr/share/maven/bin/mvn test'
                        //sh 'docker run --rm maven:3.6.3-adoptopenjdk-14 mvn test'
                    }
                }
                stage('build image') {
                    agent {
                        docker {
                            image 'maven:3.6.3-adoptopenjdk-14'
                        }
                    }
                    steps {
                        // jenkins overwrites /usr/bin/mvn, 
                        // so we need to access the tool directly, 
                        // instead of using the link /usr/bin/mvn
                        sh '/usr/share/maven/bin/mvn install -DskipTests'
                        //sh 'docker run --rm maven:3.6.3-adoptopenjdk-14 mvn install'
                    }
                }
            }
        }
    }
}
