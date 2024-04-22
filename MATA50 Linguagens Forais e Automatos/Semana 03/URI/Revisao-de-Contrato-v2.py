def e1(n): #estagio1
  if (seq[i] == "0"):
    return "*";
  elif (seq[i] == x):
    return "*";
  else:
    return seq[i];

def e2 (n): #estagio 2
  if (seq[i] == x):
    return "*";
  else:
    return seq[i];


while True:
  try: 
    entrada = input().split()

    x = str(entrada[0])
    seq = str(entrada[1])

    tam = len(seq)

    e = 0; 
    #e = 0 estagio 1 
    #e = 1 estagio 2

    if (x,seq == 0) and (tam == 1):
      break



    cont = 0;
  

    for i in range(tam):
      if(seq[i] != "0") and (seq[i] != x):
        e = e + 1;
      
      if (e1(seq[i])== "*") and (i == 0) and (e == 0):
        print (end = "")
        cont = cont + 1;
      elif (e1(seq[i])== "*" and (e == 0)):
        print (end = "")
        cont = cont + 1;

      elif (e2(seq[i])== "*"):
        print (end = "")
        cont = cont + 1;

      else:
        print (seq[i], end = "")


    if (cont == tam):
      print (0)
    else:
      print ()

  except (x == 0 , seq == 0):
    break



 