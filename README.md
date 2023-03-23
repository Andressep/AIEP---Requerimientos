## REQUERIMIENTOS Y MODELOS DE NEGOCIOS

En un juego de computador existen 2 tipos de jugadores: los principiantes y los
avanzados. Todos ellos deben tener un nombre y un número de vidas. Los principiantes
se desplazan andando a unas coordenadas (x,y). 

Los jugadores avanzados además de andar también pueden conducir un vehículo para
desplazarse más rápido a unas coordenadas.

Cada vehículo tiene asociada una velocidad que puede ser leída y ajustada a un valor
dado pero no puede superar una velocidad máxima dada. La velocidad máxima sólo
se podrá asignar una vez y no podrá ser modificada.

Todos los atributos de las clases serán privados y tendrán métodos públicos para
acceder a ellos (get/set) salvo que los requisitos indiquen lo contrario.
Debe existir un método que se llame andar y otro conducir.