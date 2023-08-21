#listas = Ariel, Liliana , Natalia

nombres = ['Ariel', 'Liliana' , 'Natalia' , 'mica'] #cada nombre ocupa un espacio
print(nombres)
print(nombres[0])
print(nombres[1]) 
print(nombres[0:2]) #de cero hasta 2, no incluye la posicion 2. es la 0 y la 1 
print(nombres[ :3]) #de cero hasta 3, no incluye la posicion 3. es la 0, la 1  y 2
print(nombres[1: ]) #desde 1 hasta el final
#modificar un valor de la lista
nombres[3] = 'juana' #cambio natalia por juana
print(nombres)
#iterar una lista
for nombre in nombres: #nombre es singular, la lista es plural
    print(nombre)
else:
    print('se acabaron los nombres de la lista')
    
#preguntamos cuantos nombres tiene nuestra lista
print(len(nombres))
#agregamos un elemento a la lista
nombres.append('marcelo')
print(nombres)
#insertar un elemento en una posicion especifica
nombres.insert(1, 'Alberto')
print(nombres)
nombres.insert(3, 'Debora')
print(nombres)

#eliminar un elemento de la lista
nombres.remove('Alberto')
print(nombres)

#eliminar el ultimo elemento
nombres.pop() #elimina el ultimo por default
print(nombres)

del nombres[2]
print(nombres)

#eliminar, borrar, o limpiar todos los elementos
nombres.clear()
print(nombres)

#eliminar lista
del nombres
print(nombres) #error, no se imprime porq ya fue eliminada