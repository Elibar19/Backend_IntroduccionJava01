/* . Realizar un programa que obtenga la siguiente matriz [[3], [6], [9], [12], [15]] y devuelve y 
muestre el siguiente array [6, 9, 12, 15, 18].  */

var matriz = [[3], [6], [9], [12], [15]]

function aplanarMatriz(matriz){
    return matriz.flat();
}

matriz = aplanarMatriz(matriz);
console.log(matriz);

function modificarMatriz(matriz){
    matriz.splice(0,1);
    matriz.push(18);
    return matriz
}

var matrizNueva = modificarMatriz(matriz);

console.log(matrizNueva)