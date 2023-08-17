/* Crear un objeto persona, con las propiedades nombre, edad, sexo ('H' hombre, 'M' mujer, 
'O' otro), peso y altura. A continuación, muestre las propiedades del objeto JavaScript */

function Persona(nombre, edad, sexo, peso, altura){
    this.nombre = nombre;
    this.edad = edad;
    this.sexo = sexo;
    this.peso = peso;
    this.altura = altura;
}

const persona = new Persona("Elian", 26, 'H', 62, 1.65);

for (const property in persona) {
    console.log(`${property} : ${persona[property]}`)
}