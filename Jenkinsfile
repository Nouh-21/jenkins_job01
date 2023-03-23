
def gv

pipeline {
   agent any
   parameters {
      string(name: 'VRS', defaultValue: '', description: 'this is my version default on prd')
      choice(name: 'VERSION', choices: ['0.0.1', '0.2.1', '0.3.3'], description: '')
      booleanParam(name: 'testExecute', defaultValue: true, description: '')
   }
   tools {
      maven 'maven-3.9'
   }
   environment {
          VERSION_NUM = '1.0.1'
          CREDENTAILS_USER = credentials('user_credentials')
   }
   stages {
      
      stage("init"){
         steps { 
             script {
                  gv = load "script.groovy"
               }
          }
      }
     stage("Build") {
        steps {
             script {
                  gv.build()
             }
        }
     }
     
     stage("test") {
        when {
           expression {
              params.testExecute
           }
        }
      
      steps {
            script {
               gv.test()
            }
        }
    }
   
    stage("deploye") {
        steps {
             script {
            gv.deploye()
            }
           //  sh ${CREDENTAILS_USER}          
      }
   }
       }
         
}
