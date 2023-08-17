/* Resalte todas las palabras de más de 8 caracteres en el texto del párrafo (con un fondo 
    amarillo, por ejemplo) */

var parrafo = document.getElementById("resaltar");

var contenido = parrafo.textContent

var palabras = contenido.split(" ");

for (let i = 0; i < palabras.length; i++) {
    if (palabras[i].length > 8){
        palabras[i] = "<span style='background-color : yellow;'>"+palabras[i]+"</span>"
    }
}

parrafo.innerHTML = palabras.join(" ");