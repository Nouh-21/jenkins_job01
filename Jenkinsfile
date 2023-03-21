pipeline {
   agent any;
   stages {
     stage("test") {
      steps {
         echo 'his is a testing stage'
      }
     }
     
     stage("build") {
        when {
           expression {
                  BRANCH_NAME == 'main'
           }
        }
      steps {
         echo 'this is a building  stage'
      }
    }
   
    stage("deploye") {
        steps {
             echo 'this is a deploo'

      }
   }
       }

}
