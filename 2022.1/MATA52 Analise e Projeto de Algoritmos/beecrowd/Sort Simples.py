x = []

a, b, c =input().split()

a = int(a)
b = int(b)
c = int(c)

x.append(a)
x.append(b)
x.append(c)

y = []
y = y+x

y.sort()

for l in y:
    print(l)

print()
    
for li in x:
    print(li)