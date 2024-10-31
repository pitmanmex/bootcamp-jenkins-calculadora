pipeline {
  //agent any
  agent { label 'jdk21' }
  tools {
    maven "maven 3.9.9"
  }
  parameters {
    string(name: 'ENTRADA', defaultValue: 'Hola', description: 'Un parametro requerido')
  }

  stages {
    stage ('ejemplo') {
      steps {
        echo params.ENTRADA
      }
    }
    
    stage('Build') {
      steps {
        bat 'mvn -B -q package'
      }
      post {
        always {
          junit 'target/surefire-reports/*.xml'
        }
      }
      
    }
  }

        post {
        always {
          echo "Siempre se ejecuta"
        }
        faiure {
          echo "Falló la operación"
        }
        success {
          echo "étsito"
        }
        aborted {
          echo "abort mission"
        }
        change {
          echo "cambiado"
        }
        fixed {
          echo "corregido y aumentado"
        }

        }

}
