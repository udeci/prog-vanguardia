package ar.edu.udeci.pv;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class StringsExamples {


    public static void main(String args[]){
        String textExample;
        textExample = "Hola mund" + 'o' + ", hoy es :";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        ZonedDateTime zonedDateTime = Instant.now().atZone(ZoneId.systemDefault());
        String formattedDate = zonedDateTime.format(formatter);
        textExample += formattedDate + " !!!";
        System.out.println(textExample);


        // 1. Obtener la longitud de la cadena
        System.out.println("--- 1. Longitud de la cadena ---");
        String text = "Programación en Java";
        int length = text.length();
        System.out.println("La longitud del texto es: " + length); // 20

        System.out.println("\n");

        // 2. Concatenar cadenas
        System.out.println("--- 2. Concatenación ---");
        String part1 = "Hola";
        String part2 = " Mundo";
        String combined = part1.concat(part2);
        String combinedWithPlus = part1 + part2;
        System.out.println("Resultado con concat(): " + combined); // Hola Mundo
        System.out.println("Resultado con '+': " + combinedWithPlus); // Hola Mundo

        System.out.println("\n");

        // 3. Comparar cadenas
        System.out.println("--- 3. Comparación ---");
        String str1 = "Java";
        String str2 = "java";
        boolean equals = str1.equals(str2);
        boolean equalsIgnoreCase = str1.equalsIgnoreCase(str2);
        System.out.println("¿'Java' es igual a 'java'? " + equals); // false
        System.out.println("¿'Java' es igual a 'java' (ignorando mayúsculas)? " + equalsIgnoreCase); // true

        System.out.println("\n");

        // 4. Buscar y verificar
        System.out.println("--- 4. Búsqueda ---");
        String sentence = "El lenguaje de programación es Java.";
        int index = sentence.indexOf("Java");
        boolean contains = sentence.contains("programación");
        System.out.println("La palabra 'Java' se encuentra en el índice: " + index); // 28
        System.out.println("¿La frase contiene 'programación'? " + contains); // true

        System.out.println("\n");

        // 5. Reemplazar
        System.out.println("--- 5. Reemplazo ---");
        String original = "El perro es mi mascota favorita. El perro es leal.";
        String newString = original.replace("perro", "gato");
        System.out.println("Cadena original: " + original);
        System.out.println("Cadena modificada: " + newString);

        System.out.println("\n");

        // 6. Extraer y modificar
        System.out.println("--- 6. Extracción y modificación ---");
        String data = "Datos: 123456789";
        String sub = data.substring(7); // Extrae desde el índice 7 hasta el final
        System.out.println("Subcadena extraída: " + sub); // 123456789

        String caps = data.toUpperCase();
        String lower = data.toLowerCase();
        System.out.println("En mayúsculas: " + caps); // DATOS: 123456789
        System.out.println("En minúsculas: " + lower); // datos: 123456789

        String withSpaces = "   Hola Mundo   ";
        String trimmed = withSpaces.trim();
        System.out.println("Original con espacios: '" + withSpaces + "'");
        System.out.println("Sin espacios: '" + trimmed + "'"); // 'Hola Mundo'

        System.out.println("\n");

        // 7. Dividir una cadena
        System.out.println("--- 7. División ---");
        String fruits = "manzana,banana,naranja";
        String[] fruitArray = fruits.split(",");
        System.out.println("Arreglo de frutas:");
        for (String fruit : fruitArray) {
            System.out.println("- " + fruit);
        }
    }
}
