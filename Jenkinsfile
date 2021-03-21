pipeline {
    agent any 
    stages {
        stage('Test Variable') {
            steps {
                withCredentials([usernamePassword(credentialsId: 'WSL_FTP', passwordVariable: "GIT_PASSWORD", usernameVariable: "USERNAME")]) {
                    script {
                        env.URL_ENCODED_GIT_PASSWORD=URLEncoder.encode(GIT_PASSWORD, "UTF-8");
                    }
                    script {
                        env.URL_ENCODED_GIT_USERNAME=URLEncoder.encode(USERNAME, "UTF-8");
                    }
                        bat "echo ${URL_ENCODED_GIT_USERNAME} and ${URL_ENCODED_GIT_PASSWORD}"
                }
            }
        }
    }
}