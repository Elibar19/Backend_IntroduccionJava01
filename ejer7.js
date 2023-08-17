/* Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación 
solicite números al usuario hasta que la suma de los números introducidos supere el 
límite inicial.  */

var limitePositivo = parseFloat(prompt("Ingrese un número, el mismo será el límite positivo de la suma de los siguientes numeros que ingrese: "));
var sumaNros = 0;

while(sumaNros < limitePositivo) {
    let numeroSuma = parseFloat(prompt("Ingrese el siguiente numero a sumar: "));
    if (isNaN(numeroSuma)) {
        alert("Por favor, ingrese un número válido.");
        continue; // Salta a la siguiente iteración si no se ingresa un número válido
    }
    sumaNros += numeroSuma;
    
    if (sumaNros >= limitePositivo) {
        break; // Sale del bucle cuando la suma alcanza o supera el límite
    }
}

alert(`La suma de los números ingresados es: ${sumaNros}`);


