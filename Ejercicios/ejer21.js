/* Escribir un programa para obtener un array de las propiedades de un objeto Persona. 
Las propiedades son nombre, edad, sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura.  */

const persona = {
    nombre : "Elián",
    edad : 26,
    sexo : 'H',
    peso : 62,
    altura : 1.69
};

var arrayPropiedades = Object.keys(persona);

console.log(arrayPropiedades)
