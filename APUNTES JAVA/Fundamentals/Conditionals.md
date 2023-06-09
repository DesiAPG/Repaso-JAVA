---
creation date: 2023-05-23 11:41
modification date: Tuesday 23rd May 2023 11:41:05
---

<< [[2023-05-22]] | [[2023-05-24]] >>

# Conditionals

## Condicional if

Los condicionales son declaraciones que hacemos en java para darnos como resultado un booleano, si la función se cumple quiere decir que es true y ejecutará el Código que pongamos dentro de la declaración 'if'. Si no se cumple es false, así que procederá a ejecutar el Código que pongamos dentro de la declaración 'else'.

![[if1.png]]

```Java
public class weather {  
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
        Question question = new Question();  
        System.out.println("How is the weather?");  
        String myDay = scanner.nextLine();  
        question.weather(myDay);  
    }  
}
```

Este primer programa lo que hace es invocar la clase Question, la cual ya la veremos, pide mediante un scanner una respuesta y llama la función weather, ahora la clase question tiene el siguiente método.

```Java
package conditionals;  
  
public class Question {  
    public void weather(String myDay) {  
        if (myDay.equals("sunny")) {  
            System.out.println("Walk the dog");  
        } else if (myDay.equals("cloudy")) {  
            System.out.println("Read a book");  
        } else if (myDay.equals("raining")) {  
            System.out.println("watch a movie");  
        } else {  
            System.out.println("Go to sleep");  
        }  
    }  
}
```

Como se puede apreciar lo que pasa es que hay muchos condicionales, esto es, lo que hace es varias comprobaciones a ver cuál de estas nos devuelve un valor con base a nuestras necesidades, se compone de la declaración, la condición, el cuerpo que sería el código que se ejecuta si se cumple la condición y finalmente un else que tiene contiene el código que se ejecutara de ser falsa la condición.

![[elseifladder.png]]

### Operador ternario

Otra forma de poder declarar una condición es usando el operador ternario, el cual hace lo mismo que un if, pero de manera implícita y en una línea un **ejemplo** de esto puede ser.

```Java
package conditionals;  
  
public class TernaryOperator {  
    public static void main(String[] args) {  
        int number = 18;  
        String output = (number >= 18) ? "Upper age" : "Under age";  
        System.out.println(output);  
    }  
}
```

Este es un simple código usando el operador ternario donde si se cumple la condición, arroja 'upper age' de lo contrario arroja 'under age' y el resultado lo guardamos en una #variable llamada output.

### Anidación de 'if'

En este punto se pueden hacer condicionales dentro de otros condicionales, la lógica es simple, si la primera condición se cumple, ejecuta el código donde estará alojada otra condición, de ser falso saldrá de las dos declaraciones, pero si es verdadero continuará ejecutando el código que está dentro del 'if'.

```Java
package conditionals;  
  
public class IfAnidation {  
    public static void main(String[] args) {  
        int age = 34;  
        int weight = 65;  
        if (age >= 18) {  
            if (weight >= 60 && weight <= 100) {  
                System.out.println("You can donate blood");  
            }  
        } else {  
            System.out.printf("You can't donate blood");  
        }  
    }  
}
```

En este código se declaran e inicializan dos variables y hace dos comprobaciones, si es mayor o igual a 18 años y su peso es mayor que 60 kg y menor de 100 kg, podrá donar sangre, de lo contrario si no cumple alguna de las dos, no podrá.

![[nestedif.png]]


## Switch

En esta expresión, lo que hacemos es algo muy parecido, pero en ciertos casos es más legible y entendible, cuando tenemos varios condicionales que queremos implementar, con un switch podríamos liberarnos de anidar demasiados if.

```Java
public class SwitchExpression {  
  
    public static void main(String[] args) {  
        int day = 3;  
        String myDay = "";  
        switch (day) {  
            case 1:  
                myDay = "Monday";  
                break;  
            case 2:  
                myDay = "Tuesday";  
            case 3:  
                myDay = "Wednesday";  
                break;  
            case 4:  
                myDay = "Thursday";  
            case 5:  
                myDay = "Friday";  
                break;  
            case 6:  
                myDay = "Saturday";  
            case 7:  
                myDay = "Sunday";  
        }  
        System.out.println(myDay);  
    }  
}
```

En este caso iniciamos con la #variable day en la cual le asignamos un valor, y un String myDay, lo que hace el switch es recorrer todos los casos y si alguno cumple con la condición que se pone en paréntesis ejecutara el código dentro de case, y por último se hace un break para que no siga recorriendo más el switch, si no encuentra ninguno que cumpla la condición se ejecutara la declaración default.

![[java-switch-statement.png|center]]

