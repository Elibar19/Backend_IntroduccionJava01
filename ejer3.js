/* Escriba un programa en donde se pida la edad del usuario. Si el usuario es mayor de 
edad se debe mostrar un mensaje indicándolo.  */



let edad = prompt("Escriba su edad: ");

//condicional IF normal
if (edad >= 18 ){
    alert("Usted es mayor de edad");
} else {
    alert("No es mayor de edad");
}

//Condicional ternario
(edad >= 18) ? alert("Es mayor de edad") : alert("No es mayor de edad");