pipeline {
    agent any

    stages {
        stage ('Compile Stage') {

            steps {
                echo 'Compiling the application...'
                withMaven(maven : 'maven_3_8_1') {
                    sh 'mvn clean compile'
                }
            }
        }

        stage ('Testing Stage') {

            steps {
                echo 'Testing the application...'
                withMaven(maven : 'maven_3_8_1') {
                    sh 'mvn test'
                }
            }
        }

        stage ('Deployment Stage') {
            steps {
                echo 'Deploying the application...'
                withMaven(maven : 'maven_3_8_1') {
                    sh 'mvn deploy'
                }
            }
        }
    }
}
