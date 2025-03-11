def call() {
    dependencyCheck additionalArguments: ''' 
                    -o './'
                    -s './'
                    -f 'ALL' 
                    --prettyPrint''', odcInstallation: 'OWASP'
    dependencyCheckPublisher pattern: 'dependency-check-report.xml'
}