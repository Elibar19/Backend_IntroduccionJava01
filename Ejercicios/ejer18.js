/* A partir del siguiente array: var valores = [true, 5, false, "hola", "adios", 2]:
a) Determinar cual de los dos elementos de texto es mayor
b) Utilizando exclusivamente los dos valores booleanos del array, determinar los 
operadores necesarios para obtener un resultado true y otro resultado false
c) Determinar el resultado de las cinco operaciones matemáticas realizadas con los 
dos elementos numéricos */

var valores = [true, 5, false, "hola", "adios", 2]

//sacar los elementos de tipo string

var maxLongitud = 0;
var textoMayor = "";

// compararlos y asignarlos
for (const texto of valores) {
    if (typeof texto === "string"){
        if (texto.length > maxLongitud){
            maxLongitud = texto.length;
            textoMayor = texto;
        }
    }
}

console.log(`El texto mayor es: ${textoMayor}`)

//b. buscamos los valores booleanos en el array.
//busco el valor que sea booleano y verdadero
const valorTrue = valores.find(valor => typeof valor === "boolean" && valor);
//busco el valor booleano y falso
const valorFalse = valores.find(valor => typeof valor === "boolean" && !valor);

//obtengo los resultados true y false;

const resultadoTrue = valorTrue || valorFalse;
const resultadoFalse = valorTrue && valorFalse;

console.log(`Resultado True: ${resultadoTrue}`);
console.log(`Resultado False: ${resultadoFalse}`);

//C busco los datos de tipo number filtrando el array, ya que con find se detiene en el primer elemento encontrado de ese tipo.
const numeros = valores.filter(valor => typeof valor === "number");
if (numeros.length >= 2) {
    const numero1 = numeros[0];
    const numero2 = numeros[1];

    console.log(`Suma: ${numero1 + numero2}`);
    console.log(`Resta: ${numero1 - numero2}`);
    console.log(`Multiplicación: ${numero1 * numero2}`);
    console.log(`División: ${numero1 / numero2}`);
    console.log(`Módulo: ${numero1 % numero2}`);
} else {
    console.log("No hay suficientes valores numéricos en el array.");
}