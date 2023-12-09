def luta(x, n2, at):
  d = 0
  if(at == 3):
    return x/(x + n2)
  else:
    d = 1 - (6 - at)/6
    d = (1 - d)/d
    return (1.0 - pow(d, x))/(1.0 - pow(d, x + n2))


while True:
  ev1, ev2, at, d = input().split()
  ev1 = int(ev1)   # vida do ataque
  ev2 = int(ev2)   # vida da defesa
  at = int(at)     # ataque
  d = int(d)       # dano 

  if (ev1 == 0 and ev2 == 0 and at == 0 and d == 0):
    break
  else:
    tmp = 0
    p = 0
  
    tmp = ev1
    ev1 = 0
    while(tmp > 0):
      tmp -= d 
      ev1 += 1
      
    tmp = ev2
    ev2 = 0
    while(tmp > 0): 
      tmp -= d
      ev2 += 1
  
    p = luta(ev1, ev2, at)
    print('%.1f' % (p * 100))