import math

while True:
  try: 
    n, l, c = input().split()
    texto = input().split()

    linha = ""
    linhas = []
    removerEspaco = True

    i = 0
    # print(texto)
    while i < int(n):
      if len(linha) + len(texto[i]) <= int(c):
        # print(texto[i])
        linha = linha + texto[i] + " "
        i += 1
      else:
        linha = linha[:-1]
        linhas.append(linha)
        linha = ""

    linhas.append(linha)
    # print (linhas)
    print(math.ceil(len(linhas)/int(l)))
      
  except EOFError:
    break