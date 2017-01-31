p = [0, 1, 5, 8, 9, 10]
OPT = [0]
a=[]
n= raw_input("Enter length")
n = int (n)
for i in range(1, n+1):
    for k in range(1, i+1):
        a.append(p[k]+OPT[i-k])
    OPT.append(max(a))

print OPT[n]
