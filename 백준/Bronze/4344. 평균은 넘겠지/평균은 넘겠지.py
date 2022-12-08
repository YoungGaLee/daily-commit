// round는 정수를 소수로 표현할 수 없음
// formating 잘 기억하기

line = int(input())

for _ in range(line):
    num, *scores = map(int,input().split())
    avg = sum(scores)/num
    cnt = 0
    
    for i in scores:
        if i > avg : cnt+=1
    
    print("{0:.3f}%".format(cnt/num*100))
