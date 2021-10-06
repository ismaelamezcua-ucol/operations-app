pipeline {
    agent any
    
    stages {
        stage('build') {
            steps {
                git branch: 'main', url: 'https://github.com/ismaelamezcua-ucol/operations-app.git'
                sh 'mvn clean package'
            }
        }
    }
}