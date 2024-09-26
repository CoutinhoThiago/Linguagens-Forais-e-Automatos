def procura(matrix, visitada, x, y):
  if x >= 0 and x < 5 and y >= 0 and y < 5:
    visitada[x][y] = 's'
    if x == 4 and y == 4:
      global ganhador 
      ganhador = 1
      return(0)
    else:
      if y + 1 < len(matrix) and x < len(matrix) and matrix[x][y+1] == '0' and visitada[x][y+1] == 'n':
          procura(matrix, visitada, x, y+1) 
      if  x + 1 < len(matrix) and y< len(matrix) and matrix[x+1][y] == '0' and visitada[x+1][y] == 'n':
          procura(matrix, visitada, x+1, y)
      if y - 1 >= 0 and matrix[x][y-1] == '0' and visitada[x][y-1] == 'n':
          procura(matrix, visitada, x, y-1) 
      if x - 1 >= 0 and matrix[x-1][y] == '0' and visitada[x-1][y] == 'n':
          procura(matrix, visitada, x-1, y)

T = int(input())

for i in range(T):  

  n = input()
  while 2>1:
    if n != "":
      l1 = n.split()
      break
    else:
      n = input()
  #l1 = input().split()
  l2 = input().split()
  l3 = input().split()
  l4 = input().split()
  l5 = input().split()

  matrix = [l1,l2,l3,l4,l5]

  visitada = [['n','n','n','n','n'], ['n','n','n','n','n'], ['n','n','n','n','n'], ['n','n','n','n','n'], ['n','n','n','n','n']]

  ganhador = 0
  procura(matrix, visitada, 0, 0)

  if ganhador == 1:
    print("COPS")
    ganhador = 0
  else:
    print("ROBBERS")


# for i in range(T):  
#   input()

#   l1 = input().split()
#   l2 = input().split()
#   l3 = input().split()
#   l4 = input().split()
#   l5 = input().split()

#   matrix = [l1,l2,l3,l4,l5]

#   ganhador = 0
#   procura(matrix, 0, 0)

#   if ganhador == 1:
#     print("COPS")
#     ganhador = 0
#   else:
#     print("ROBBERS")