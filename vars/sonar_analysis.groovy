def call(sonarserver,sonarproject,sonarkey){
    withSonarQubeEnv("${sonarserver}"){
    sh """
    ${scannerHome}/bin/sonar-scanner -D sonar.projectName=${sonarproject} -D sonar.projectKey=${sonarkey} -D sonar.sources=.
    """
    }
}