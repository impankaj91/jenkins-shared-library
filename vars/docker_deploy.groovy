def call(){
     echo "Deploying code to the server"
     sh 'docker-compose down && docker-compose up -d'
}
