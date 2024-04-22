while True:
  try: 
 
    palavra = input()
    tam = len(palavra)

    for i in range(tam):
      if (i%2 == 0):
        print (palavra[i].swapcase(), end = "")
      elif (i%2 == 1):
        print (palavra[i], end = "")
    print ()

  except EOFError:
    break