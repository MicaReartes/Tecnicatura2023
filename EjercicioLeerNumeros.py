"""
clase 7 - ejercicio 3
leer 10 numeros e imprimir cuantos son positivos, cuantos negativos y cuantos neutros
"""
conteo_positivos = 0
conteo_negativos = 0
conteo_neutros = 0

for i in range(10):
    num = int(input("ingrese 10 numeros: "))
    if num > 0:
        conteo_positivos = conteo_positivos + 1
    elif num == 0:
        conteo_neutros = conteo_neutros + 1
    elif num <0:
        conteo_negativos = conteo_negativos + 1
print(conteo_positivos, "son positivos")
print(conteo_neutros, "son neutros")
print(conteo_negativos, "son negativos")