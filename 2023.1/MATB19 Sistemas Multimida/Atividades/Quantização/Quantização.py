def quantization(matrix):
  tabela = [
      [16, 11, 10, 16, 24, 40, 51, 61],
      [12, 12, 14, 19, 26, 58, 60, 55],
      [14, 13, 16, 24, 40, 57, 69, 56],
      [14, 17, 22, 29, 51, 87, 80, 62],
      [18, 22, 37, 56, 68, 109, 103, 77],
      [24, 35, 55, 64, 81, 104, 113, 92],
      [49, 64, 78, 87, 103, 121, 120, 101],
      [72, 92, 95, 98, 112, 100, 103, 99]
  ]

  matrizQuantizada = [[0] * 8 for i in range(8)]

  for i in range(8):
    for j in range(8):
      matrizQuantizada[i][j] = round(matrix[i][j] / tabela[i][j])
  return matrizQuantizada



matrix = []
for i in range(8):
  i = list(map(float, input().split()))
  matrix.append(i)

matrizQuantizada = quantization(matrix)

for i in matrizQuantizada:
    print(" ".join(map(str, i)))