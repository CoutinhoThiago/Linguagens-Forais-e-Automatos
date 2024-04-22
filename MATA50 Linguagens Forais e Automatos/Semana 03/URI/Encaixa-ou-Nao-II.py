n = int(input())
i = 0

while (i<n):
  tudo = input().split()
  palavra = str(tudo[0])
  encaixa = str(tudo[1])


  tam_palavra = len(palavra)
  tam_encaixa = len(encaixa)

  j = 0
  k = tam_palavra - 1
  l = tam_encaixa - 1
  cont = 0

  while (j<tam_encaixa):
    if (palavra[k] == encaixa[l]):
      k = k - 1
      l = l - 1
      cont = cont +1
    j = j + 1
  
  if (cont >= tam_encaixa):
    print ("encaixa")
  else:
    print ("nao encaixa")

  i = i+1
