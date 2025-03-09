def call(){
     echo "Deploying code to the server - $(hostname)"
     sh 'docker-compose down && docker-compose up -d'
}
