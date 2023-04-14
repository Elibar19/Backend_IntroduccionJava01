package Ejer2.Entidades;

public class Cafetera {
        private int capacidadMaxima = 1000;
        private int cantidadActual;

        public Cafetera(int capacidadMaxima, int cantidadActual) {
            this.capacidadMaxima = capacidadMaxima;
            this.cantidadActual = cantidadActual;
        }

        public int getCapacidadMaxima() {
            return capacidadMaxima;
        }

        public void setCapacidadMaxima(int capacidadMaxima) {
            this.capacidadMaxima = capacidadMaxima;
        }

        public int getCantidadActual() {
            return cantidadActual;
        }

        public void setCantidadActual(int cantidadActual) {
            this.cantidadActual = cantidadActual;
        }

        public Cafetera() {
        }
}
