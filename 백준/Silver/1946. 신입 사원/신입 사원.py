import sys

def check(N):
    
    scores = [list(map(int,sys.stdin.readline().split())) for _ in range(N)]
    
    by_document = sorted(scores, key=lambda x:x[0])
    
    check_s = by_document[0][1]
    count =1

    for score in by_document:  
        if score[1] < check_s: 
            count += 1 
            check_s = score[1]

    return count





test_case = int(sys.stdin.readline())

for _ in range(test_case):
    N = int(sys.stdin.readline()) 
    ans = check(N)
    
    print(ans)