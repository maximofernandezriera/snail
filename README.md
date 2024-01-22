## https://www.codewars.com/kata/521c2db8ddc89b9b7a0000c1/train/java

Este es un clásico en la programación, lo difícil es establecer los límites del recorrido.

Considerando la primera matriz del kata: https://www.codewars.com/kata/521c2db8ddc89b9b7a0000c1/train/java

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

**Segunda vuelta (¿y final?):**

En este momento, todos los límites señalan al mismo elemento central, que es el `5`. Recogemos ese elemento y, al intentar realizar otra vuelta, nos damos cuenta de que no hay más elementos por recorrer. Esto sucede cuando los límites se "cruzan". En realidad, en este caso específico, se encuentran en el mismo punto, pero en matrices más grandes, el "cruce" se refiere a que los límites se superponen o no hay espacio entre ellos para recorrer más elementos.

## Pseudocódigo

    función snailOrdenado(matriz):
        si la matriz está vacía:
            retorna una lista vacía

    Inicializa un array vacío para almacenar el resultado

    Establece los límites iniciales
    
    limiteSuperior = 0
    limiteInferior = longitud de matriz - 1
    limiteIzquierdo = 0
    limiteDerecho = longitud de matriz[0] - 1

    Mientras (limiteSuperior <= limiteInferior) y (limiteIzquierdo <= limiteDerecho) entonces
        # Recorrer la fila superior
        Para j desde limiteIzquierdo hasta limiteDerecho:
            agrega matriz[limiteSuperior][j] al resultado
        limiteSuperior++

        # Recorrer la columna derecha
        Para i desde limiteSuperior hasta limiteInferior:
            agrega matriz[i][limiteDerecho] al resultado
        limiteDerecho--

        # Recorrer la fila inferior si todavía hay filas restantes
        Si limiteSuperior <= limiteInferior entonces
            Para j desde limiteDerecho hacia abajo hasta limiteIzquierdo:
                agrega matriz[limiteInferior][j] al resultado
            limiteInferior--

        # Recorrer la columna izquierda si todavía hay columnas restantes
        Si limiteIzquierdo <= limiteDerecho entonces
            para i desde limiteInferior hacia arriba hasta limiteSuperior:
                agrega matriz[i][limiteIzquierdo] al resultado
            limiteIzquierdo++

    retorna resultado

