compara, sequencia = input().split()
compara = int(compara)

while (compara != 0) and (sequencia != 0):
  resposta = ""

  for i in range(len(sequencia)):
    if (int(sequencia[i]) != compara):
      resposta = resposta + sequencia[i]

  
  if (len(resposta) > 0) and (int(resposta) > 0):
    print (int(resposta))
  else:
    print (0)

  compara, sequencia = input().split()
  ompara = int(compara)



