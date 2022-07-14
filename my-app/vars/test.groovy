pipeline{

      agent any
        tools {
  maven 'MAVEN'
              }
      stages {
        stage ('Compile Stage') {
            steps {
                 
                    sh 'mvn clean install'
            }
        }
      }
}
