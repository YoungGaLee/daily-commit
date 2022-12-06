H, M = map(int,input().split())
M-=45

if(M<0): 
    H-=1
    M+=60 
    if(H<0):
        H+=24

print(H,M)



'''
<모범답안>
line2를 보면 모든 M
연산량 관련 공부 이후 마저 피드백

H,M = map(int,input().split())
if M > 44:
    print(H, M-45)
elif M<45 and H>0:
    print(H-1,M+15)
else:
    print(23,M+15)
'''
