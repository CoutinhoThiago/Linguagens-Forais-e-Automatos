def geraLabirinto(v, labirinto):
  for i in range(v):
    labirinto[i] = []
  return(labirinto)
  
def preencheLabirinto(n, a, labirinto):
  for j in range(a):
    dados2 = input().split() # as linhas vem a seguir são um segmento de linha que Pedro tem disponível para para desenhar o labirinto desejado
    n1 = int(dados2[0])
    n2 = int(dados2[1])
    if n1 not in labirinto[n2]:
      labirinto[n2].append(n1)
    if n2 not in labirinto[n1]:
      labirinto[n1].append(n2)
  return(labirinto)
  
def fds(visitado, labirinto , n, caminho): #fds = fodase 
  if n not in visitado:
    visitado.add(n)
    for k in labirinto[n]:
      caminho = fds(visitado, labirinto , k, caminho) + 1
  return(caminho)


  
for r in range(int(input())):
  n = int(input()) # n é o ponto (nodo) no qual o desenho deve ser iniciado e também é onde o desenho deve ser terminado
    
  dados = input().split()
  v = int(dados[0]) # v é a quantidade de vértices do desenho
  a = int(dados[1]) # a é a quantidade de arestas do desenho
    
  labirinto = geraLabirinto(v, {})
  preencheLabirinto(n, a, labirinto)

  resp = fds(set(), labirinto, n, 0)
  print(resp)
