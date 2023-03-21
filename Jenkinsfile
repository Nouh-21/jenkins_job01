pipeline {
   agent any
   environments {
         VERSION_NUM = '1.0.1'
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
         echo 'this is a number of version ${VERSION_NUM}'
      }
    }
   
    stage("deploye") {
        steps {
             echo 'this is a deploo'

      }
   }
       }

}
