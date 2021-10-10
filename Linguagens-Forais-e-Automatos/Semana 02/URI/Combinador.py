cdt = int(input())  #casos de teste

resp = []*cdt

i=0;
while (i<cdt):
  linha = input().split()
  a = linha[0]
  b = linha[1]
  



  tama=len(a);
  tamb=len(b);
  tam=0;

  j = 0; 
  m=0; n=0; 
  tot = tama+tamb;
  r = [a]*(tot);
  while (j<tot):
    if (j%2==0) and (n<tama):  
      r[j]=a[n];
      
      n=n+1;
    elif (j%2==1) and (m<tamb):
      r[j]=b[m];
      
      m=m+1;
    else:
      if (tama>tamb):
        r[j]=a[n];
        
        n=n+1;
      elif (tama<tamb):
        r[j]=b[m];
        
        m=m+1;
    j=j+1;

  k = 0;
  while (k<tot):
    if (k<(tot-1)):
      print (r[k], end="")
    else:
      print (r[k])
    k=k+1; 
  i=i+1;














