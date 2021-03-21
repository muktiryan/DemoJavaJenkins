pipeline {
    agent any 
    stages {
        stage('Test Variable') {
            steps {
                withCredentials([usernamePassword(credentialsId: 'WSL_FTP', passwordVariable: "GIT_PASSWORD", usernameVariable: "GIT_USERNAME")]) {
                    script {
                        env.URL_ENCODED_GIT_PASSWORD=URLEncoder.encode(GIT_PASSWORD, "UTF-8")
                    }
                        bat "echo ${GIT_USERNAME} and ${URL_ENCODED_GIT_PASSWORD}"
                }
            }
        }
    }
}