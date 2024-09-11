public class App {
    public static void main(String[] args) throws Exception {
        
      
      /* System.out.println("Hello, World! by Samuel from Java!"); */

      
      // Una variable es un espacio en memoria que tiene un nombre asociado y puede contener un valor cambiante

      //DECLARACIÓN: Es asignar el tipo de dato y el nombre de la variable sin darle un valor inicial

      // ASIGNACIÓN: Darle un valor a una variable.

      /* 
      TIPOS DE VARIABLES
      Variables primitivas: Almacenan valores básicos.
      Variables de referencia: Almacenan direecciones de memoria que apuntan a objetos.
      byte(-128 al 127), short(-32768 al 32767), int, long
      */
      
      int numero = 5;
      numero = 5;
      byte numero1 = 20;

      //TIPOS DE DATOS REALES: float (6) decimales y el double (15-16) decimales
      double decimales = 5.11232131;

      //TIPO DE DATO DE CARACTER (una solta letra)
      char letra = 's';

      //TIPO DE DATO BOOLEANO
      boolean v = true;
      boolean f = false;

      String cadena_caracteres = "You're so fuck#ng good!";


      System.out.println(numero);
      System.out.println(decimales);
      System.out.println(letra);
      System.out.println(v);
      System.out.println(f);
      System.out.println(cadena_caracteres);


      String texto = "Este es un texto asignado a una variable de tipo String";
      System.out.println(texto);

      int longitud = texto.length();  // el método length te dice la cantidad de caracteres
      System.out.println(longitud);

      char caracter = texto.charAt(20); // Muestra un caracter de un string a partir del número dentro del parametro
      System.out.println(caracter);

      String subString = texto.substring(5, 16); // Puedes decidir de un indice a otro para recortar un String
      System.out.println(subString);

      String minuscula = texto.toLowerCase();
      System.out.println(minuscula);  // Convierte todo el texto a minusculas

      String mayuscula = texto.toUpperCase();
      System.out.println(mayuscula);  // Convierte todo el texto a mayusculas

      int indice = texto.indexOf("variable"); //Te muestra desde que indice arrancó un caracter o palabra
      System.out.println(indice);

      String reemplazado = texto.replace("texto", "parrafo"); //reemplaza una palabra de un string
      System.out.println(reemplazado);

      boolean contiene = cadena_caracteres.contains("fuck#ng"); // verifica si dentro del string tiene un valor en especifico.
      System.out.println(contiene);
      
      //  OPERADORES

      /* Aritmeticos */

      double a = 5;
      double b = 10;
      double c = 9;
      double d = a + (b/c);  /*si tenemos casos asi donde las divisiones no son exactas debemos asegurarnos de cambiar el tipo de dato a uno decimal como double a todos las variables y no entero como INT */

      System.out.println(d);

      int z = 12;
      int x = z % 5;  // nos dara el residuo de la división de 2 números, en este caso el valor de z entre el número 2. (esta es una buena forma de sacar números par o impar)

      System.out.println(x);

      /* Incremento - Decremento */

      int incrementar = 6;
      incrementar += 9; // modificamos el valor de una variable (podemos usar todos los operadores)
      incrementar *=2;   // Ademas cada modificación hereda el valor anterior
      incrementar -=10;
      incrementar /=2;
      incrementar %=2;

      incrementar++; // Estos 2 aumentar o disminuyen el valor de una variable unidad por unidad
      incrementar--;

      System.out.println(incrementar);
      

      int edad01 = 5;
      int edad02 = 4;

      /* Comparativos */

      boolean esMayor = edad01 > edad02;
      boolean esMenor = edad01 < edad02;
      boolean esIgual = edad01 == edad02;
      boolean mayorIgual = edad01 >= edad02; 
      boolean menorIgual = edad01 <= edad02;

      System.out.println(esMayor);
      System.out.println(esMenor);
      System.out.println(esIgual);
      System.out.println(mayorIgual);
      System.out.println(menorIgual);


      /* Lógicos */

      boolean condicion1 = true;
      boolean condicion2 = false;

      boolean resultadoAND = condicion1 && condicion2;  //Ambos deben ser true para que sea true
      boolean resultadoOR = condicion1 || condicion2; // Con que una de las condiciones se cumpla nos sale true
      boolean resultadoNOT = !condicion1; // Niega los false o true es decir convierte los true o false a su opuesto.

      System.out.println(resultadoAND);
      System.out.println(resultadoOR);
      System.out.println(resultadoNOT);

    
    // ESTRUCTURAS DE CONTROL


    /* If Else */

    int edad = 13;

    if (edad >= 18) {
      System.out.println("Tienes la edad suficiente");
    } else if (edad <= 17 && edad >= 13) {
      System.out.println("Aun eres puberto! no puedes entrar!");
    } else {
      System.out.println("Te perdiste de local hijo, llamare a tu mamá");
    }


    /* Switch */
    // Sirve mucho y es buena practica cuando tengamos que colocar muchos else if y no tener tanto código

    // What kind of beverage do you like?

    String beverage = "alcohol";

    switch (beverage) {
      case "soda":
        System.err.println("Soda generally has a lot of sugar, so be careful");
        break;
      case "water":
        System.out.println("A great decision! It's healthy");
        break;
      case "juice":
        System.out.println("Mmm, delicious! I like having banana juice at lunch");
        break; 
      case "alcohol":
        System.out.println("Be careful if you are going to drive!");
        break;
      case "monster":
        System.out.println("Why? you won't have classes or exams soon");
        break;
      default:
        System.out.println("Please give me a valid answer... ");
        break;
    }

    // Procura utilizar el mismo formato de la variable que utilizamos para los cases en la estructura de control switch











    }
}
