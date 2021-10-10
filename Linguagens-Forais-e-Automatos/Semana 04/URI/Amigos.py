def intersecao(n, m):
  j = 0
  r = []*0
  while (j<len(n)):
    k = 0
    while (k<len(m)):
      if (n[j] == m[k]):
        r.extend(n[j])
      k = k + 1
    j = j + 1
  return (r)
    
def soma(n, m):
  j = 0
  while (j<len(m)):
    k = 0
    r = 0
    while (k<len(n)):
      if (n[k] != m[j]):
        r = r + 1
      k = k + 1
    if (r == len(n)):
      n.extend(m[j])
    j = j + 1
  return (n)

def subtracao(n, m):
  j = 0
  r = n
  while (j<len(n)):
    k = 0
    while (k<len(m)):
      if (n[j] == m[k]):
        n.remove(n[j])
      k = k + 1
    j = j + 1
  return (n)


while True:
  try:
    entrada = str(input())
    tamanho = len(entrada) 

    i = 0
    a =[]*0
    while (entrada[i] != "}"):
      if (entrada[i] != "{"):
       a.extend(entrada[i])
      i = i + 1
    i = i + 1
    
    while (i < tamanho):
      b =[]*0
      while (entrada[i] != "}"):
        if (entrada[i] == "*"):
          e = 0
        elif (entrada[i] == "+"):
          e = 1
        elif (entrada[i] == "-"):
          e = 2

        if (entrada[i] != "{") and (entrada[i] != "+"):
          b.extend(entrada[i])
        i = i + 1
      i = i + 1
      if (e == 0):
        a = intersecao(a, b)
      if (e == 1):
        a = soma(a, b)
      if (e == 2):
        a = subtracao(a, b)
      
    tam = len(a)
    loop = 0
    print ("{", end = "")
    while(loop < tam):
      print (a[loop], end = "")
      loop = loop + 1
    print ("}")


  except EOFError:
    break