pipeline {
   agent any
   environment {
          VERSION_NUM = '1.0.1'
          CREDENTAILS_USER = credentials('user_credentials')
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
         echo "this is a number of version ${VERSION_NUM}"
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
