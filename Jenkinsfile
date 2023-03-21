pipeline {
   agent any
   environment {
          NEW_VERSION = '1.0.1'
   }
   stages {
     stage("test") {
      steps {
         echo 'his is a testing stage'
      }
     }
     
     stage("build") {
      
      steps {
         echo 'this is a building  stage'
         echo 'this is a number of version ${NEW_VERSION}'
      }
    }
   
    stage("deploye") {
        steps {
             echo 'this is a deploo'

      }
   }
       }

}
