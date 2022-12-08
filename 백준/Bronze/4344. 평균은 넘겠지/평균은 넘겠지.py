line = int(input())

for _ in range(line):
    num, *scores = map(int,input().split())
    avg = sum(scores)/num
    cnt = 0
    
    for i in scores:
        if i > avg : cnt+=1
    
    print("{0:.3f}%".format(cnt/num*100))
