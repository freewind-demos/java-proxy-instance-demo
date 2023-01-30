Java Proxy Instance Demo
=====================

Java的动态代理。

How to run:

1. Run `Hello.java` in your IDE.
2. Use maven plugin `exec-maven-plugin`:
   ```
   mvn clean compile exec:java
   ```
3. Use maven plugin `maven-dependency-plugin` and `maven-jar-plugin`
   ```
   mvn clean package; java -jar target/demo.jar
   ```