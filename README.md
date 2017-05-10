# ProyectoTP1Ev3
Proyecto de la evaluación 3 de ED - Trabajo practico 1

# Testing

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
    
Después ejecutamos como JUnit Test. "Run As" > JUnit Test para que nos de el resultadod el test.

Todo esto es si usted quiere crear su propio test, pero en el mismo proyecto ya viene dado un Test llamado "MathTest.java" con su propio código y sus propios test.
