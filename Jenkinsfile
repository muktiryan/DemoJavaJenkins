pipeline {
    agent any 
    stages {
        stage('Test Variable') {
            steps {
                withCredentials([usernamePassword(credentialsId: 'WSL_FTP', usernameVariable: "USERNAME" , passwordVariable: "GIT_PASSWORD")]) {
                    script {
                        env.URL_ENCODED_GIT_USERNAME=URLEncoder.encode(USERNAME, "UTF-8");
                    }
                        bat "echo ${USERNAME} with  ${GIT_PASSWORD}"
                }
            }
        }
    }
}