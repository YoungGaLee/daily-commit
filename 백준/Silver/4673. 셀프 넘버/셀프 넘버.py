# 1차
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
    
'''
크기비교하지말고 
일단 마킹한다음에 10000번만 출력하면 될거 같음.

그럼 연산량 더 줄까? 
'''

# 2차
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
        
'''
결과는 동일 : 30616KB  /  48ms
그래도 더 깔끔한 듯
'''
