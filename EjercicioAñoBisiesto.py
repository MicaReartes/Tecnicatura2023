"""
clase 7 - ejercicio año bisisesto
diseñar un programa que ingresando un año indique si es bisiesto o no,
- repetir la accion hasta que el usuario lo decida
"""
opcion = 0
while opcion != 1 : #ciclo para repetir la accion
    año = int(input("ingrese un año: "))
    if (año % 4 == 0) and (año % 100 != 0) or (año % 400 == 0): #opcion positiva
        print("el año es bisiesto")
    else:
        print("el año no es bisiesto") #opcion negativa
    opcion=int(input("para continuar ingrese la opcion 1: "))