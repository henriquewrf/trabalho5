pipeline {
  agent any
  stages {
    stage('Get Git Files') {
      steps {
        git branch: 'main', url: 'https://github.com/henriquewrf/trabalho5'
      }
    }

    stage('Buld') {
      steps {
        bat 'mvn -D maven.test.failure.ignore=true clean package'
      }
    }

    stage('Test') {
      steps {
        bat 'mvn test -f pom.xml'
      }
    }

  }
}