pipeline {
  agent any
  stages {
    stage('error') {
      steps {
        git(url: 'https://github.com/pokerov/RESTful-Application-Consumer.git', branch: 'master', changelog: true)
      }
    }
    stage('s2') {
      steps {
        sh 'gradle clean build'
      }
    }
  }
}
