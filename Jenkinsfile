pipeline {
   agent any
   parameters {
      string(name: 'VRS', defaultValue: '', description: 'this is my version default on prd')
      choise(name: 'VERSION', choises: ['0.0.1', '0.2.1', '0.3.3'], description: '')
      booleanPram(name: 'testExecute', defaultValue: true, description: '')
   }
   tools {
      maven 'maven-3.9'
   }
   environment {
          VERSION_NUM = '1.0.1'
          CREDENTAILS_USER = credentials('user_credentials')
   }
   stages {
     stage("test") {
      steps {
         echo 'his is a testing stage'
         sh "mvn install"
      }
     }
     
     stage("build") {
        when {
           expression {
              params.testExecute == true
           }
        }
      
      steps {
         echo 'this is a building  stage'
         echo "this is a number of version ${params.VERSION}"
      }
    }
   
    stage("deploye") {
        steps {
             echo 'this is a deploo'
             echo " this is a credentials ${CREDENTAILS_USER}"
           //  sh ${CREDENTAILS_USER}          
      }
   }
       }

}
