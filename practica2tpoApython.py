frase = input("ingresar frases: ")
frase = frase.split()
for palabra in frase :
    print(palabra.upper())

contar = input("ingresa la palabra que quieres que se cuente: ")
print(frase.count(contar))

vieja = input("Que palabra quieres remplazar: ")
nueva = input("por cual quieres remplazar: ")

for palabra in frase :
    print(palabra.replace(vieja, nueva))