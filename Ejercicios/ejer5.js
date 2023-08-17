/* Construir un programa que simule un menú de opciones para realizar las cuatro 
operaciones aritméticas básicas (suma, resta, multiplicación y división) con dos valores 
numéricos enteros. El usuario, además, debe especificar la operación con el primer 
carácter de la operación que desea realizar: ‘S' o ‘s’ para la suma, ‘R’ o ‘r’ para la resta, ‘M’ 
o ‘m’ para la multiplicación y ‘D’ o ‘d’ para la división. */

let numeros = prompt("Ingrese dos numeros separados por un espacio para realizar la operacion aritmetica");
let numerosArray = numeros.split(" "); // creamos un array con los dos numeros

if (numerosArray.length !== 2) {
    alert("Debe ingresar dos numeros")
} else {
let opcion = prompt(`Elija una opcion seleccionando la letra correspondiente: 
"S" (si desea sumar)
"R" (si desea restar)
"M" (si desea multiplicar)
"D" (si desea dividir)`).toLowerCase() //lo convertimos a minusculas para evitar errores de lectura de mayusculas

//convertimos a number el string
let num1 = parseInt(numerosArray[0]);
let num2 = parseInt(numerosArray[1]);

switch (opcion) {
    case 's':
        alert(`El resultado es: ${num1+num2}`)
        break;
    case 'r':
        alert(`El resultado es: ${num1-num2}`)
        break;
    case 'm':
        alert(`El resultado es: ${num1*num2}`)
        break; 
    case 'm':
        alert(`El resultado es: ${num1/num2}`)
        break;     
    default: alert("No ha ingresado un opcion correcta")
}
}