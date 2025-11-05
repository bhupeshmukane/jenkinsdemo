pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                echo 'Checking out code from GitHub...'
            }
        }
        stage('Build') {
            steps {
                bat 'echo "Building Java Application"'
            }
        }
    }
}