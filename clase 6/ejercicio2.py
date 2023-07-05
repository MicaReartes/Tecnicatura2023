"""
Clase 6 - ejercicio 2:
Determinar la solucion logica de la sgte operacion

((3 + 5 * 8 ) < 3 and ((- 6/3 x 4 ) + 2 < 2)) or (a > b)
"""
a = float(input("digite el valor de A: "))
b = float(input("digite el valor de B: "))

resultado = ((3 + 5 * 8) < 3 and ((- 6/3 * 4) + 2 < 2)) or (a > b)
print(f"el resultado es: {resultado}")