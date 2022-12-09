omr = [0  for i in range(10000)]

def d(const):
    ans = const + sum(list(map(int,str(const))))
    return ans

for n in range(10000):
    ans = d(n)
    if ans > 9999: continue
    omr[ans] = 1
    
for index, i in enumerate(omr):
    if index == 0 : continue
    if i==0 : print(index)
    