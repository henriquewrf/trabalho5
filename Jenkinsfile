pipeline {
  agent any
  stages {
    stage('Checkout Scm') {
      steps {
        git 'https://github.com/henriquewrf/trabalho5'
      }
    }

    stage('Batch script 0') {
      steps {
        bat 'mvn -D maven.test.failure.ignore=true clean package'
      }
    }

  }
}