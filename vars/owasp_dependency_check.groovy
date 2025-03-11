def call() {
    dependencyCheck additionalArguments: ''' 
                    -o './'
                    -s './'
                    -f 'ALL' 
                    --prettyPrint --no-update''', odcInstallation: 'OWASP'
    dependencyCheckPublisher pattern: 'dependency-check-report.xml'
}