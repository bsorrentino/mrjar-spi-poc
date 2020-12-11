# mrjar-spi-poc

Using **Java Multi Release Jar** [JEP-238](http://openjdk.java.net/jeps/238) to support [SPI](https://docs.oracle.com/javase/tutorial/sound/SPI-intro.html) in **Java8**, **Java9** and above.

**Note**
> Project has been developed ad Proof Of Concept to resolve issue [224](https://github.com/bsorrentino/maven-confluence-plugin/issues/224) in project [maven-confluence-plugin](https://github.com/bsorrentino/maven-confluence-plugin)

## Build

```
mvn -Pmrjar clean install
```

## Run either java8 or above

```
 mvn -pl mrjar-spi-main -Pmrjar exec:java -Dexec.mainClass=org.bsc.main.Main

```

## Articles

* [Multi-Release Jar Files](https://www.baeldung.com/java-multi-release-jar)
