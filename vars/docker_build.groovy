def call(project,tag){
    echo 'Building the docker image'
    sh 'docker build -t ${project}:${tag} .'
}
