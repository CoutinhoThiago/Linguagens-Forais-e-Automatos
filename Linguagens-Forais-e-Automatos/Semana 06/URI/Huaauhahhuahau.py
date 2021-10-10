t1 = "" #tipo 1
t2 = "" #tipo 2

entrada = input()
tamanho = len(entrada)
for i in range(tamanho):
  if (entrada[i] == 'a') or (entrada[i] == 'e') or (entrada[i] == 'i') or (entrada[i] == 'o') or (entrada[i] == 'u'):
    t1 = t1 + entrada[i]

aux = entrada[::-1]
tamaux = len(aux)
for j in range(tamaux):
  if(aux[j] == 'a') or (aux[j] == 'e') or (aux[j] == 'i') or (aux[j] == 'o') or (aux[j] == 'u'):
    t2 = t2 + aux[j]

if(t1==t2):
  print("S")
else:
  print("N")
