## Exemple 1 

N'est pas bon car l'exeption ArrayIndexOutOfBoundsExeption ne vas jamais être lancer car l'Exeption est avant et ArrayIndexOutOfBoundsExeption est inclue dans Exception

Pour que le code soit bon il faut :

```kotlin
fun uneFonction(){
    try {
        //du code…
    } catch (a: ArrayIndexOutOfBoundsException){
        println("Erreur : $a")    
    } catch (e: Exception){
        println("Erreur : $e")
    
    }
}
```

Exemple 2
N'est pas bon car NumberFormatException arrivera seulement quand la conversion d'un string en nombre ne marche pas ce qui n'arriverait pas avec des calcules compliqués
(Sauf si le but est vraiment de confirmer la conversion des String)

Pour que le code on pourait :
mettre l'exeption ArithmeticException

fun calculerPoidsSupernova() {
	try {
		//calculs compliqués...
	} catch (e:ArithmeticException) {}
}