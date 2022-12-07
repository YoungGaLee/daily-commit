'''
try~ except
구문 오류 시 사용 (사용자 입력값 존재하는 경우)
또한 에러가 발생돼도 프로그램이 중단X, 에러상황에 해당하는 동작설정가능
'''

try:
    while(1):
        A, B = map(int,input().split())
        print(A+B)
except:
    exit()