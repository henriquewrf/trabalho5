pipeline {
    agent any

    tools {
        // Install the Maven version configured as "M3" and add it to the path.
        maven "M3"
    }

    stages {
        stage('Build') {
            steps {
                // Get some code from a GitHub repository
                git branch: 'main', url: 'https://github.com/henriquewrf/trabalho5'

                // Run Maven on a Unix agent.
                sh "mvn -D maven.test.failure.ignore=true clean package"

            }
        }
        stage('Test') {
                    steps {

                        sh "mvn test -f pom.xml"

                    }
                }
        stage('Deploy') {
                            steps {

                                sh "deploy -f pom.xml"

                            }
                        }
    }
}
