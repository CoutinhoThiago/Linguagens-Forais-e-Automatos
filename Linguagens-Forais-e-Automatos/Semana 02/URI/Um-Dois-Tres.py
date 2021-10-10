




np = int(input())

i = 0;

while (i<np):
  x = input()

  tamx = len(x)

  confer1 = 0;
  confer2 = 0;
  confer3 = 0;

  if (tamx == 3):
    if (x[0] == "o"):
      confer1=confer1+1;
    if (x[1] == "n"):
      confer1=confer1+1;
    if (x[2] == "e"):
      confer1=confer1+1;

  if (tamx == 3):
    if (x[0] == "t"):
      confer2=confer2+1;
    if (x[1] == "w"):
      confer2=confer2+1;
    if (x[2] == "o"):
      confer2=confer2+1;

  if (tamx ==5):
    if (x[0] == "t"):
      confer3=confer3+1;
    if (x[1] == "h"):
      confer3=confer3+1;
    if (x[2] == "r"):
      confer3=confer3+1;
    if (x[3] == "e"):
      confer3=confer3+1;
    if (x[4] == "e"):
      confer3=confer3+1;


  if (confer1>=2):
    print ("1")
  if (confer2>=2):
    print ("2")
  if (confer3>=4):
    print ("3")
  i=i+1;
    
    