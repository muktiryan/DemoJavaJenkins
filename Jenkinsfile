pipeline {
    agent any 
    stages {
        stage('Test Variable') {
            steps {
                withCredentials([usernamePassword(credentialsId: 'WSL_FTP', passwordVariable: "GIT_PASSWORD", usernameVariable: "USERNAME")]) {
                        bat "echo ${USERNAME} with  ${URL_ENCODED_GIT_PASSWORD}"
                }
            }
        }
    }
}