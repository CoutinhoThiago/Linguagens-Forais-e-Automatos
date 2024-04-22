def maiorLucro(dia):
  maior = dia[0]
  menor = dia[0]
  for i in dia[1:]:
    menor = max(menor + i, i)
    maior = max(maior, menor)
  return maior

while True:
  try:
    n = int(input()) # n representa o número de dias que George pode trazer o seu circo para a cidade
    dia = []
    
    custoPorDia = int(input()) # custoPorDia representa o custo em manter o circo na cidade
  
    for i in range(n): 
      receita = int(input()) # cada linha a seguir representa a receita que o circo obtem em cada dia
      dia.append(receita - custoPorDia)
      
    lucro = maiorLucro(dia)
    if lucro >= 0:
      saida = lucro
    else:
      saida = 0
    
    print(saida)

  except EOFError: # O final da entrada é indicado por EOF (fim de arquivo) 
    break