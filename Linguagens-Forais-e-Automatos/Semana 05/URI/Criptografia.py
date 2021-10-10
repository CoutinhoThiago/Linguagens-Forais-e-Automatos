numero = int(input())
for i in range(numero):
  palavra = input()
  p2 = ""
  p4 = ""
  i = int(0)

  for x in palavra:
    if x.isalpha():
      p2 += chr(ord(x) + 3)
    else:
      p2+= x

  p3 = p2[::-1]

  a = int(len(p3)/2)

  p4 += p3[0:a]

  for a in p3[a::]:
    p4 += chr(ord(a) - 1)

  print (p4)