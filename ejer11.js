/* Escribir una función que reciba un String y devuelva la palabra más larga. 
String Ejemplo: “Guia de JavaScript”
Resultado esperado : “JavaScript” */

var frase = prompt("Escriba una frase: ");

function palabraLarga(frase){
    //dividir la frase en palabras en un array
    palabraLarga = frase.split(" ");

    // Inicializar variables para la palabra más larga y su longitud máxima
    let palabraMasLarga = "";
    let valorMax = 0;

    // Iterar sobre cada palabra y encontrar la más larga
    palabraLarga.forEach(palabra => {
        if (palabra.length > valorMax){
            valorMax = palabra.length;
            palabraMasLarga = palabra;
        }
    });
    return palabraMasLarga;
}

var resultado = palabraLarga(frase);

alert("La palabra mas larga es: "+resultado)