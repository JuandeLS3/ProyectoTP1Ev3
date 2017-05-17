# PJUnit Test Suite
Proyecto de la evaluación 3 de ED - Trabajo practico 1

# Testing desde IDE

Para realizar testing de la clase Math.java, primero abrimos eclipse o algún otro IDE y creamos un 
Creamos un nuevo "Junit Test Case". En la ventana que se nos abre, marcamos la casilla setUp() y pulsamos finish.
Posteriormente se nos abrirá otra ventana, pulsamos "OK".

Después de esto tan solo debemos escribir el código que queramos probar. ej:

    import org.junit.Assert;
    import org.junit.Before;
    import org.junit.Test;
    public class MathTest {
        Math math;
        @Before
        public void setUp() throws Exception {
            math = new Math(7, 10);
        }
        @Test
        public void testAdd() {
            Assert.assertEquals(17, math.add());
        }
    }
    
Después ejecutamos como JUnit Test. "Run As" > JUnit Test para que nos de el resultado el test.

Todo esto es si usted quiere crear su propio test, pero en el mismo proyecto ya viene dado un Test llamado "MathTest.java" con su propio código y sus propios test.


# Testing desde JVM (Console)

En primer lugar, debemos compilar nuestra clase, a la cual queremos aplicarle testing. En nuestro caso será Math.java

    javac -cp lib/*:. Math.java

A continuación compilamos la clase que realiza los test a Math.java. En nuestro caso será MathTest.java

    javac -cp lib/*:. MathTest.java
    
Por último, ya podemos realizar los test a Math.java que creamos necesarios. Para ello ejecutaremos el siguiente comando:

    java -cp lib/*:. org.junit.runner.JUnitCore MathTest

El resultado obtenido desde consola debería ser el siguiente.

    JUnit version 4.8.2
    ....
    Time: 0,008

    OK (4 tests)
    
 Dando lugar a que los 4 test de MathTest.java han sido exitosos.
 
 
# Changelog

**1.0.2**
- Se corrigen errores en MathTest.java
- Se modifica README.MD y se añaden instrucciones para la ejecución en línea de comandos. 

**1.0.1**
 - Se modifica readme.md

**1.0.0**
 - Commit inicial
 - Subida de ficheros y readme.md















