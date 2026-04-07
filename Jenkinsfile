pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main',url:'https://github.com/AA011157/selenium_jenkins.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Report') {
            steps {
              publishHTML([
                    reportDir: 'target',
                    reportFiles: 'ExtentReport.html',
                    reportName: 'Test Report',
                    keepAll: true,
                    alwaysLinkToLastBuild: true,
                    allowMissing: true
                ])
            }
        }
    }
}
