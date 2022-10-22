pipeline {
    agent any
    tools {
            maven 'Maven'
        }

    stages {
        stage('Build') {
            steps {
                echo 'Maven packaging'
                sh 'mvn clean package'
            }
        }
        stage('Create docker image') {
            steps {
                echo 'Creating docker image...'
                sh 'docker build -t photoserver:1 .'
            }
        }
//         stage('Deleting older container') {
//             steps {
//                  echo 'Deleting older container...'
//                  sh 'docker rm -f test1'
//             }
//         }

//         stage('Deleting nameless docker images') {
//             steps {
//                 echo 'Deleting nameless images...'
//                 sh 'docker rmi $(docker images -q -f dangling=true)'
//             }
//         }
//         stage('Creating container') {
//             steps {
//                  echo 'Creating container...'
//                  sh 'docker run --name test1 -d -p 8081:8081 test:1'
//             }
//         }
    }
}