#ejercicio 1 : escribir la sigte expresion en forma de expresion algoritmica
# A3 X (b2 - 2ac)/2b
#1 - pedimos al usuario 3 valores = a, b, c
#2 - mostramos el resultado

a = float(input('digite el valor de a: '))
b = float(input('digite el valor de b: '))
c = float(input('digite el valor de c: '))
resultado = (a**3 * (b**2 - 2 * a * c)) / (2 * b)
print(f'el resultado es: {resultado}')