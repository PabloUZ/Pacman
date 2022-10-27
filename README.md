# PACMAN

## ¿En que consiste?
Es un juego desarrollado en java utilizando los procesos en paralelo de los hilos.

Consiste en un laberinto en el que se mueven el jugador (pacman) y tres fantasmas. El objetivo es escapar de los fantasmas, cuyo movimiento es pseudoaleatorio.

## Historia
El juego fue desarrollado durante el segundo semestre de 2022 como proyecto de corte de Programación Orientada a Objetos (POO).

La finalidad de este proyecto es la aplicacion de dos conceptos de la programación, por un lado el manejo de hilos y procesos en paralelo, y por el otro, arquitectura del programa (clases y funcionalidad).

## Mecánicas y especificaciones

### Dibujo de los elementos
Todos los elementos están creados a partir de la clase 'Graphics', que sirve para crear figuras geometricas.

Adicionalmente se le asignó a cada figura un area con la clase 'Rectangle' para poder calcular las colisiones entre los objetos.

### Paredes
Las paredes son un conjunto de rectangulos superpuestos para formar el laberinto.

### Fantasmas
Los fantasmas son circulos blancos que se mueven un pixel a la vez hacia una de las cuatro direcciones cardinales.

Cuando un fantasma colisiona con una pared, se genera un numero pseudoaleatorio entre 1 y 4 para determinar la nueva direccion del mismo.

### Pacman
Pacman es un circulo amarillo controlado por el jugador por medio de la detección de las teclas 'W A S D'. Se mueve 5 pixeles por cada pulsacion de tecla siempre y cuando no colisione contra ninguna pared.

Cuando se detecta una colision con un fantasma, el juego se detiene.