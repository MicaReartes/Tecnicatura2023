"""
clase 7 - ejercicio 4
etapas de la vida
"""
edad = int(input("ingrese su edad: "))
mensaje = None
if 0 <= edad < 10 :
    mensaje = "la infancia es increible y bella"
elif 10 <= edad < 20:
    mensaje = "hay mucha escuela y mucho tiempo libre"
elif 20 <= edad < 30:
    mensaje = " no tenes vida social y es pura facultad"
elif 30 <= edad < 50:
    mensaje = "encontras el amor y comienza el trabajo"
elif 50 <= edad < 60:
    mensaje = "POR FIN JUBILADO"
elif 70 <= edad < 100:
    mensaje = "a esperar la muerte"
else:
    mensaje = "todavia no se sabe que pasa a esa edad, es un misterio (?"
print(f"tu edad es {edad}, donde {mensaje}")