def call() {
    
    trivy fs --scanners vuln,secret,misconfig .
}