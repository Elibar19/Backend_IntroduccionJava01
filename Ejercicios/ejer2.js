/* Conocido el número en matemática PI π, pedir al usuario que ingrese el valor del radio 
de una circunferencia y calcular y mostrar por pantalla el área y perímetro. Recuerde que 
para calcular el área y el perímetro se utilizan las siguientes fórmulas: 
area = PI * radio2 
perimetro = 2 * PI * radio */

let radio = prompt("Ingrese el valor del radio de una circunferencia: ");

let area = Math.PI * Math.pow(radio,2);
let perimetro = 2 * Math.PI * radio;

alert(`El area de la circunferencia es: ${area}`);
alert(`El perimetro de la circunferencia es: ${perimetro}`);