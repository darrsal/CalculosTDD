pipeline{
	agent any
	tools { 
      maven 'maven_devops' 
    }
    triggers {
        githubPush()
    }
    environment {
		POMpath="CalculosTDD/PrimerProgramaMaven/pom.xml"
	}
	stages{
        stage('Descargar repositorio') { 
            steps {
				git url: 'https://github.com/darrsal/CalculosTDD.git', branch: 'main'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn -f $POMpath  -B clean package'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn -f $POMpath test'
            }
            post {
                always {
                    junit 'CalculosTDD/PrimerProgramaMaven/target/surefire-reports/*.xml'
                }
            }
        }
        stage('Despliegue'){
            steps {
                archiveArtifacts artifacts: 'CalculosTDD/PrimerProgramaMaven/target/*.jar', fingerprint: true
            }
        }
	}
}
