def ZigZag(matrix):
  zigZag = []
  tamanho = len(matrix)

  for i in range(tamanho + tamanho - 1):
    if i < tamanho:
      linhaInicial = 0
      LinhaFinal = i + 1
      if i %2 == 0:
        coluna = LinhaFinal - 1
        while coluna >= linhaInicial:
          zigZag.append(matrix[coluna][i-coluna])
          coluna -= 1
      else:
        coluna = linhaInicial
        while coluna < LinhaFinal:
          zigZag.append(matrix[coluna][i-coluna])
          coluna += 1
    else:
      linhaInicial = i - tamanho + 1
      LinhaFinal = tamanho
      if i %2 == 0:
        coluna = LinhaFinal - 1
        while coluna >= linhaInicial:
          zigZag.append(matrix[i - coluna][coluna])
          coluna -= 1
      else:
        coluna = linhaInicial
        while coluna < LinhaFinal:
          zigZag.append(matrix[i-coluna][coluna])
          coluna += 1

  return zigZag

matrix = []
for J in range(8):
  linha = list(map(int, input().split()))
  matrix.append(linha)

resultado = ZigZag(matrix)
print(' '.join(map(str, resultado)))