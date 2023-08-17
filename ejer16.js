/* Realizar un programa que rellene dos vectores al mismo tiempo, con 5 valores aleatorios 
y los muestre por pantalla.  */

let array1 = [];
let array2 = [];

function llenarVectores(array1, array2){
    for (let index = 0; index < 5; index++) {
        array1.push(Math.round(Math.random() * 10));
        array2.push(Math.round(Math.random() * 10));
    }
}

llenarVectores(array1, array2);

array1.forEach(valor => console.log(valor));
array2.forEach(valor => console.log(valor));