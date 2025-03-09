def call(id,project,tag){
    withCredentials([usernamePassword(credentialsId:"${id}",passwordVariable:"dockerHubPass",usernameVariable:"dockerHubUser")]){
    echo "Pushing the image to dockerhub - ${env.dockerHubUser}"
    sh """
       docker login -u ${env.dockerHubUser} -p ${env.dockerHubPass}
       docker tag ${project}:${tag} ${env.dockerHubUser}/${project}:${tag}
       docker push ${env.dockerHubUser}/${project}:${tag} 
      """
}
