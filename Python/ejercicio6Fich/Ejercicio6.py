#!/usr/bin/env python
# -*- coding: utf-8 -*-

'''
Realiza un programa que diga cuántas ocurrencias de una palabra hay en un
fichero. Tanto el nombre del fichero como la palabra se deben pasar como
argumentos en la línea de comandos.
'''

nombreFichero=input("Dime el nombre del fichero")
palabra=input("Dime el la palabra que quieres contar")
cont=0
lista = []

lectura = open(nombreFichero + ".txt", "r")

palabrasAlmacenadas=lectura.read()

lista=palabrasAlmacenadas.split()

lectura.close()

for i in lista:
    if(i==palabra):
        cont=cont+1

print("Esa palabra se repite "+str(cont)+" veces")

