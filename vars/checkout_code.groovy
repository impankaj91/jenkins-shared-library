def call(url,branch){
    echo 'Cloning the code from the repo'
    git branch: "${branch}", url: "${url}"
    echo 'Code Clone done!'
}
