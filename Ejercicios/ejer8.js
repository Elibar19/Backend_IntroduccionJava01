/* Escribir un programa que lea números enteros hasta teclear 0 (cero). Al finalizar el 
programa se debe mostrar el máximo número ingresado, el mínimo, y el promedio de 
todos ellos. */

var max;
var min;
var promedio;
var suma = 0;
var contador = 0;
var numero;


do {
    numero = parseInt(prompt("Ingrese un número. Cuando ingrese '0' el programa se detendra"));
    if (numero === 0) {
        break;
    }
    if (contador === 0 ){
        max = numero;
        min = numero;
    }
    if (numero > max){
        max = numero;
    }
    if (numero < min){
        min = numero;
    }

    suma += numero;
    contador++;

} while (numero !== 0);

alert(`El valor máximo ingresado es ${max}
El valor mínimo ingresado es ${min}
El promedio de la suma de todos los números es ${suma/contador}`)