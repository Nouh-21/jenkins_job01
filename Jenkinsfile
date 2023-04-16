#!/usr/bin/env groovy

pipeline {
    agent none
    stages {
        stage('build') {
            when {
                expression { BRANCH_NAME == 'main' }
            }
            steps {
                script {
                    echo "Building the application..."
                }
            }
        }
        stage('test') {
            
            steps {
                script {
                    echo "Testing the application..."
                    echo "This is a stage on branch $BRANCH_NAME"
                }
            }
        }
        stage('deploy') {
            when {
                expression { BRANCH_NAME == 'main' }
            }
            steps {
                script {
                    echo "Deploying the application..."
                }
            }
        }
    }
}
