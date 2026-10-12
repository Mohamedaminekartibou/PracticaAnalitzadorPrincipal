# PracticaAnalitzadorPrincipal

Projecte Java gestionat amb Maven. Cal tenir instal·lats el JDK 25 o superior i Maven.

Per executar les proves:

```shell
mvn test
```

Per executar l'analitzador:

```shell
mvn compile
java -cp target/classes AnalitzadorPrincipal
```


Me encontre con muchas problemas para ejecutar el AvaluadorPracticaTest.java , porque no lo tenia en un Maven  , pero al final  se resolvio canviando la estructura .
