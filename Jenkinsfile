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
                sh 'rm -rf CalculosTDD'
                sh 'git clone --single-branch --branch main https://github.com/darrsal/CalculosTDD.git'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn -f $POMpath  -B -DskipTests clean package'
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
