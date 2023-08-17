/* Realizar un programa que pida una frase y el programa deberá mostrar la frase con un 
espacio entre cada letra. La frase se mostrara así: H o l a. Nota: recordar el 
funcionamiento de la función Substring(). */

var frase = prompt("Ingrese una frase: ");

//Aca divido la frase por letra creandose un array que lo vuelvo a unir con join mediante un espacio en un solo string
let resultado = frase.split().join(" ");

alert(`La nueva frase es: 
${resultado}`)

