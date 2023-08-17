/* Crear un objeto libro que contenga las siguientes propiedades: ISBN, Título, Autor, 
Número de páginas. Crear un método para cargar un libro pidiendo los datos al usuario 
y luego informar mediante otro método el número de ISBN, el título, el autor del libro y el 
numero de páginas. */

function Libro(){
    this.ISBN = parseInt(prompt("Ingrese el ISBN del libro"));
    this.Titulo = prompt("Ingrese el titulo del libro");
    this.Autor = prompt("Ingrese el autor del libro");
    this.Paginas = parseInt(prompt("Ingrese el numero de paginas del libro"));
}

const libro = new Libro();

for (const propiedades in libro) {
    console.log(`${propiedades} : ${libro[propiedades]}`)
}
