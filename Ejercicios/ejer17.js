/* Realizar un programa que elimine los dos últimos elementos de un array. Mostrar el 
resultado */

const array = Array.from({ length : 5 }, () => Math.floor(Math.random() * 10));

//El método splice() en JavaScript tiene la capacidad de aceptar índices negativos para hacer referencia a elementos 
//desde el final del array hacia el principio. Cuando usas un índice negativo, estás contando elementos desde el final del array, 
//comenzando en -1 para el último elemento, -2 para el penúltimo, y así sucesivamente
array.splice(-2);

//array.splice(3,2)

console.log(array);

//lo mismo con el signo negativo al caso anterior, cuenta desde el final hacia el inicio.
//array.slice(0,-2)

//cambiando la longitud del array con array.length podemos eliminar valores tambien. array.length() -= 2;
