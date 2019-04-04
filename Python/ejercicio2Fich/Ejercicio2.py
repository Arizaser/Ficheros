'''
Realiza un programa que lea el fichero creado en el ejercicio anterior y que
muestre los números por pantalla.
'''

# Abre archivo en modo lectura
archivo = open('primos.dat','r')

while True:
    linea = archivo.readline()  # lee línea
    if not linea:
        break  # Si no hay más se rompe bucle
    print(linea)  # Muestra la línea leída
archivo.close()