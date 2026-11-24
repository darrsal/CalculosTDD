pipeline{
   agent any
   tools{
      maven 'devops_maven'
   }
   triggers{
      githubPush()
   }
   environment{
        POM="PrimerProgramaMaven/pom.xml"
   }
   stages{
      stage('Descarga'){
         steps{
            git url:'https://github.com/darrsal/CalculosTDD.git', branch:'main'
         }
      }
      stage('Compilacion'){
        steps{
            sh 'mvn -f $POM -B package'
        }
      }
      stage('Prueba'){
        steps{
            sh 'mvn -f $POM test'
        }
        post{
            always{
                junit 'PrimerProgramaMaven/target/surefire-reports/*.xml'
            }
        }
      }
      stage('Empaquetado'){
        steps{
            archiveArtifacts artifacts: 'PrimerProgramaMaven/target/*.jar', fingerprint:true
        }
      }  
   }
}
