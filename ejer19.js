/* Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A 
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El 
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla. 
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números 
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor 
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado 
de 20. 
 */

//creo el array con numeros aleatorios con un decimal. 
var array1 = Array.from({length:50}, () =>  parseFloat((Math.random()* 10).toFixed(1)));

console.log(array1);
//lo ordeno de menor a mayor
array1.sort((a,b) => a-b);

console.log(array1);

var array2 = [];

//lleno el segundo array
for (let i = 0; i < 20; i++) {
    if (i<= 9){
    array2.push(array1[i])
    }
    else {
        array2.push(0.5);
    }
}

console.log(array2);