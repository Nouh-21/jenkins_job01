def build(){
   echo "this a building stage"
   sh 'mvn install'
}
def test(){
  echo 'this is a building  stage'
  echo "this is a number of version ${params.VERSION}"
}

def deploye(){
  echo 'this is a deploo'
  echo " this will deploy in env ${params.env}"
}

return this
