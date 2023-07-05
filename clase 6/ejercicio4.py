"""
clase 6 - ejercicio 4
area y longitud de un circulo
Hacer un programa para ingresar el radio de un circulo
y se reporte su area y la longitud de la circunferencia
"""
radio = float(input("ingrese el radio del circulo: "))
area = 3.14 * radio ** 2
longitud = 2 * 3.14 * radio

print(f"el area es: {area}")
print(f"la long de la circunferencia es: {longitud}")
