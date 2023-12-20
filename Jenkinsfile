pipeline {
    agent any // This specifies that the pipeline can run on any available agent

    stages {
        stage('Checkout') {
            steps {
                // Checkout the source code from your version control system (e.g., Git)
                checkout scm
            }
        }

        stage('Build') {
            steps {
                // Your build steps go here
                sh './eureka-server/mvnw clean install' // Assuming you are using Maven for Java projects
            }
        }

        stage('Test') {
            steps {
                // Your test steps go here
                sh 'mvn test'
            }
        }

        stage('Deploy') {
            steps {
                // Your deployment steps go here
                // This is just a placeholder, actual deployment steps depend on your project
                echo 'Deploying to production...'
            }
        }
    }

    post {
        success {
            // Actions to be taken if the pipeline succeeds
            echo 'Pipeline succeeded! Send notifications, etc.'
        }
        failure {
            // Actions to be taken if the pipeline fails
            echo 'Pipeline failed! Send notifications, etc.'
        }
    }
}
