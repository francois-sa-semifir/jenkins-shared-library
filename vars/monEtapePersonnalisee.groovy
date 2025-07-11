// vars/monEtapePersonnalisee.groovy
def call(body) {
    // Version la plus simple et correcte : exécute le corps directement
    script { // On garde le 'script {}' si le 'body()' contient du code Groovy arbitraire
        body() // Exécute le bloc de code passé en paramètre depuis le Jenkinsfile
    }
}