for i in range(int(input())): # T indicando o número de instâncias
  fat = input() # cada instância contém um inteiro N seguido de K pontos de exclamação
  n = ""
  k = 0 

  while True:
    n += fat[k]
    k += 1
    if(fat[k] == "!"):
      break
      
  k -= len(fat)
  fat = 1
  for i in range(int(n), 1, k):
    fat *= i
    
  print(fat)