def deslocamentoEmBloco(matriz):
  matrizDeslocada = [[0] * 8 for i in range(8)]

  for i in range(8):
    for j in range(8):
      matrizDeslocada[i][j] = matriz[i][j] - 128

  return matrizDeslocada



matriz = []
for i in range(8):
  linha = list(map(int, input().split()))
  matriz.append(linha)

matrizDeslocada = deslocamentoEmBloco(matriz)
for linha in matrizDeslocada:
  print(" ".join(map(str, linha)))