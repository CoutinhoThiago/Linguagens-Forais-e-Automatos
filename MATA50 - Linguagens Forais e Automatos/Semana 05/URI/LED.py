t = int(input())

for i in range(t):
  num = input()
  count = 0

  for i in range(len(num)):
    if(num[i] == '2' or
       num[i] == '3' or
       num[i] == '5'):
      count += 5
    elif(num[i] == '1'):
      count += 2
    elif(num[i] == '4'):
      count += 4
    elif(num[i] == '7'):
      count += 3
    elif(num[i] == '8'):
      count += 7
    else:
      count += 6

  print(count, "leds")