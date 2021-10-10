def f(n):
  if (n > 0):
    return n+f(n-1)
  else:
    return 0
    
n = int(input())

for k in range(n):
  print (f(k+1))
  