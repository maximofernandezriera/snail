## https://www.codewars.com/kata/521c2db8ddc89b9b7a0000c1/train/java

Considerando la primera matriz del kata: https://www.codewars.com/kata/521c2db8ddc89b9b7a0000c1/train/java

Este es un clásico en la programación, lo difícil es establecer los límites del recorrido.

Daros cuenta que, inicialmente, los límites están configurados de esta manera:

- Límite superior (filas): 0
- Límite inferior (filas): 2
- Límite izquierdo (columnas): 0
- Límite derecho (columnas): 2

**Primera vuelta en espiral:**

1. Recorres la fila superior de izquierda a derecha: Recoges `1, 2, 3`.
2. Recorres la columna derecha de arriba abajo: Recoges `6, 9`.
3. Recorres la fila inferior de derecha a izquierda: Recoges `8, 7`.
4. Recorres la columna izquierda de abajo arriba: Recoges `4`.

Después de hacer esto, ajustamos los límites:

- Límite superior aumenta a 1.
- Límite derecho disminuye a 1.
- Límite inferior disminuye a 1.
- Límite izquierdo aumenta a 1.

Ahora, tus límites han cambiado:

- Límite superior: 1
- Límite inferior: 1
- Límite izquierdo: 1
- Límite derecho: 1

**Segunda vuelta (¿y final?) en espiral:**

En este momento, todos los límites señalan al mismo elemento central, que es el `5`. Recogemos ese elemento y, al intentar realizar otra vuelta, nos damos cuenta de que no hay más elementos por recorrer. Esto sucede cuando los límites se "cruzan". En realidad, en este caso específico, se encuentran en el mismo punto, pero en matrices más grandes, el "cruce" se refiere a que los límites se superponen o no hay espacio entre ellos para recorrer más elementos.
