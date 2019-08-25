pipeline {
    agent none
    stages {
         stage('Back-end') {
            agent {
                docker { image 'maven:3-alpine' }
            }
            steps {
                sh 'mvn --version'
                sh 'mvn clean package'
            }
    }
        stage('Front-end') {
            agent {
                docker { image 'node:7-alpine' }
            }
            steps {
                sh 'node --version'
                sh 'cd frontend-web'
                sh 'npm -v'
            }
        }
    }
}