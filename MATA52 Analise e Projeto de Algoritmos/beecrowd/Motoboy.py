def calculaTempo(p, q, t, n):
  matrix = [[0 for x in range(p + 1)] for x in range(n + 1)]

  for i in range(n + 1):
    for j in range(p + 1):
      if i == 0 or j == 0:
        matrix[i][j] = 0
      elif q[i-1] > j:
        matrix[i][j] = matrix[i-1][j]
      else:
        matrix[i][j] = max(
          matrix[i-1][j-q[i-1]] + t[i-1], 
          matrix[i-1][j])
  return matrix[n][p]


while True:
  n = int(input()) #número de pedidos
  t = []
  q = []

  if (not n): #A final da entrada é determinado por N = 0
    break #e não deverá ser processado.

  p = int(input())
  memo = {}
  for i in range(n):
    linha = list(map(int, input().split())) #Cada uma das próximas N linhas contém um pedido
    t.append(linha[0])  #tempo total para ser entregue
    q.append(linha[1])  #quantidade de pizzas do pedido


  tempo = calculaTempo(p, q, t, n)
  print(tempo, "min.")