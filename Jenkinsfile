
pipeline {
   agent any
   tools { maven 'maven-3.9' }
   stages {
      
     stage("Build jar") {
        steps {
             echo "this is a stage build"
             sh 'mvn package'
                
             }
        }
     
     
     stage("build image") {
        steps {
        
           echo "Building image docker" 
           withCredentials([usernameColonPassword(credentialsId: 'docker_hub_repo', userVariable: 'USER', passwordVariable: 'PASS')]) {
                          sh 'docker build -t nouh21/demo-app:jma-1.0 .'
                          sh 'echo $PASS | docker login -u $USER --password-stdin '
                          sh 'docker push nouh21/demo-app:jma-1.0 '
             }
        }
           
     }
   
    stage("deploy") {
        steps {

            echo "Deploying application" 
  
         }
     }
  }
         
}
