pipeline {
  agent any
  stages {
    stage('error') {
      steps {
        git(url: 'https://github.com/pokerov/RESTful-Application-Consumer.git', branch: 'master', changelog: true, credentialsId: 'ff221ccc6fd3bf1d0664fb8290684de33a6a2137', poll: true)
      }
    }
    stage('s2') {
      steps {
        sh 'gradle clean build'
      }
    }
  }
}