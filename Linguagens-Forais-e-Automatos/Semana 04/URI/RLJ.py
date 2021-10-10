while True:
  try:
    entrada = input()
    tamanho = len(entrada)

    r = ""
    l = ""
    j = ""

    i = 0
    e = 0 #estagio
    while (i<tamanho):
      if (entrada[i] == "+") or (entrada[i] == "="):
        e = e + 1
        i = i + 1

      elif (e == 0):
        r = r + (entrada[i])
        i = i + 1

      elif (e == 1):
        l = l + (entrada[i])
        i = i + 1

      elif (e == 2):
        j = j + (entrada[i])
        i = i + 1



    if (j.isdigit() == False):
      r = int(r)
      l = int(l)
      print (r + l)

    elif (l.isdigit() == False):
      j = int(j)
      r = int(r)
      print (j - r)

    elif (r.isdigit() == False):
      j = int(j)
      l = int(l)
      print (j - l)

  except EOFError:
    break
