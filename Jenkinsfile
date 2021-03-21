pipeline {
    agent any 
    stages {
        stage('Test Variable') {
            steps {
                withCredentials([usernamePassword(credentialsId: 'WSL_FTP', passwordVariable: "GIT_PASSWORD", usernameVariable: "USERNAME")]) {
                        bat "echo ${USERNAME} with  ${GIT_PASSWORD}"
                }
            }
        }
    }
}