/* Escribir un programa de JavaScript que al clickear un botón muestre un mensaje a 
elección */

const click = document.getElementById("btn").onclick = muestraMensaje;

// click.onclick = muestraMensaje;

function muestraMensaje(){
    alert("Hola!")
}