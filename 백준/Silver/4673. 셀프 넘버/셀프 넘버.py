omr = [0  for i in range(10040)]

def d(const):
    ans = const + sum(list(map(int,str(const))))
    return ans

for n in range(10000):
    ans = d(n)
    omr[ans] = 1

for i in range(10000):
    if omr[i] == 0:
        print(i)
