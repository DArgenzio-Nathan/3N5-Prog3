## Exemple 1 
Catch l'exeption dans lireFichier car l'exeption qui confirme un problème avec le fichier

```kotlin
catch (io: IOException){
        println("Problème avec le fichier")
```

 est la dernière qui est confirmer donc si un autre exeption se lance celle si ne sera jamais lancer.

 De plus on pouras mettre d'autre exeption comme 

```kotlin
catch (e: FileNotFoundException){
        println("fichire n'est pas touvée")
```

ou 

```kotlin
catch (e: SecurityException){
        println("L'accès au fichier n'est pas possible à cause des permission")
```


## Exemple 2

Catch l'exception dans les étapes car comme cela tu peux savoir quelle étape lance un exeption. 

Mais si tu n'as pas besoin de savoir de quelle étape elle vient tu peux le mettre dans le parent se qui vas sauver de coder les exeptions dans chaque étapes 