        // vars/monEtapePersonnalisee.groovy
        def call(body) {
            // Permet d'appeler cette fonction comme une étape du pipeline
            // Exemple : monEtapePersonnalisee { echo "Contenu du bloc" }
            pipeline {
                agent any
                stages {
                    stage('Exécution Étape Personnalisée') {
                        steps {
                            script {
                                body() // Exécute le bloc de code passé en paramètre
                            }
                        }
                    }
                }
            }
        }