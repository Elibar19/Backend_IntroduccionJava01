/* Escribe un programa JavaScript para calcular el área y el perímetro de un objeto Círculo 
con la propiedad radio. Nota: Cree dos métodos para calcular el área y el perímetro. El 
radio del círculo lo proporcionará el usuario 
area = PI * radio2 
perimetro = 2 * PI * radio */

/* var radio = prompt("Ingrese el radio: ");

const circulo = {
    area : function(radio) {
        return Math.PI * Math.pow(radio, 2);
    },
    perimetro : function(radio){
        return 2 * Math.PI * radio;
    }
}

circulo.radio = parseInt(radio);

for (const key in circulo) {
    if (typeof circulo[key] === 'function') {
        console.log(`${key} : ${circulo[key](circulo.radio)}`);
    }
} */

function Circulo(radio) {
    this.radio = radio;
    this.calcularArea = function() {
      return Math.PI * Math.pow(this.radio, 2);
    };
    this.calcularPerimetro = function() {
      return 2 * Math.PI * this.radio;
    };
  }
  
  // Uso del constructor
  const circulo = new Circulo(5);
  console.log("Área:", circulo.calcularArea());
  console.log("Perímetro:", circulo.calcularPerimetro());