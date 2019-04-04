'''
Escribe un programa que guarde en un fichero con nombre primos.dat los
números primos que hay entre 1 y 500.
'''
# Abre archivo en modo escritura
archivo = open('primos.dat','w')

def esPrimo(num):
    for i in range(2, num):
        if (num%i) == 0:
            return False
    return True



for i in range(2,500):
    if(esPrimo(i)==True):
        archivo.write(str(i)+"\n")
archivo.close()