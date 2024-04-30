pipeline {
    agent {
        docker{
            image 'maven:3.8.3-jdk-11'
            
        }
    }
    
    stages {
        stage('Checkout') {
            steps{
                git url: 'https://github.com/saiGopireddi/calci_proj.git', branch: 'main'
            }
            
        }
        stage('Build') {
            steps{
                sh 'mvn clean'
                sh 'mvn compile'
            }
            
        }
        stage('Testing and Packaging') {
            steps{
                sh 'mvn test'
                sh 'mvn package'
            }
            
        }     
        stage('Static code analisys') {
            steps{
               sh 'sonar-scanner -Dsonar.projectKey=GOT-CALCI -Dsonar.sources=src' 
              
            }
        }
    }
    post {
        success {
            archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
            
            slackSend channel: '#builds', message: 'Build was successful!'
        }
        failure {
            mail to: 'lapmail@gmail.com', subject: 'Build failed', body: 'Please check Jenkins for details.'
        }
    }
}

