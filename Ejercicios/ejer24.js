/* Escribir un programa de JavaScript que a través de un formulario calcule el radio de un 
circulo y lo muestre en el HTML. */

document.getElementById("calcular1").onclick = calcularRadioConArea;

function calcularRadioConArea(){
    let area = document.getElementById("area").value;
    let radio = Math.sqrt(area / Math.PI);
    document.getElementById("res1").textContent = "El radio del circulo es: " + radio.toFixed(2);
}

document.getElementById("calcular2").onclick = calcularRadioConPerimetro;

function calcularRadioConPerimetro(){
    let perimetro = document.getElementById("perimetro").value;
    let radio = perimetro / (2 * Math.PI);
    document.getElementById("res2").textContent = "El radio del circulo es: " + radio.toFixed(2);
}