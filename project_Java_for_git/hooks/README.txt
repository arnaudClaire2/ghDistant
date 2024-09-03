# Instructions pour utiliser le hook Git

Ce dépôt contient un hook Git personnalisé pour ajouter des informations sur le commit dans un fichier `commitInfo.txt`.

## Installation du Hook

1. Copier le fichier `pre-commit` dans le répertoire `.git/hooks/` de votre dépôt local :

   ```bash
   cp project_java_for_git/hooks/pre-commit .git/hooks/pre-commit
