t = int(input())

for i in range(t):
  p = input()
  l = len(p)
  word = ""
  l1 = int(l/2)

  for j in range(l1,0,-1):
    word += p[j-1]

  for k in range(l,l1,-1):
    word += p[k-1]

  print(word);