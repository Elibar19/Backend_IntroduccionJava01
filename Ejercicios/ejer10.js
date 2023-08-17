/* Escribir una función flecha que reciba una palabra y la devuelva al revés. */

var palabra = prompt("Ingrese una palabra: ");

//funcion flecha. hacemos de la palabra un array, lo damos vuelta y lo unimos.
const palabraReversa = (palabra) => palabra.split("").reverse().join("");

var resultado = palabraReversa(palabra);

alert(resultado);