pipeline {
    agent any 
    stages {
        stage('Test Variable') {
            steps {
                withCredentials([string(credentialsId: 'WSL_FTP', variable: 'TOKEN')]) {
                   bat 'echo kampret - $TOKEN '
                }
            }
        }
    }
}