# 효율성 통과하는 법 : pop() 하는 부분을 없애고 인덱스로 조회
for문을 통해 이미 O(n)
pop(0)의 경우 복잡도 O(n)
+ deque 에서는 startswith 사용불가

'''
정확성  테스트
테스트 1 〉	통과 (0.01ms, 10MB)
테스트 2 〉	통과 (0.01ms, 10.2MB)
테스트 3 〉	통과 (0.01ms, 10.2MB)
테스트 4 〉	통과 (0.01ms, 10.2MB)
테스트 5 〉	통과 (0.01ms, 10.1MB)
테스트 6 〉	통과 (0.01ms, 10.1MB)
테스트 7 〉	통과 (0.01ms, 9.95MB)
테스트 8 〉	통과 (0.01ms, 10.1MB)
테스트 9 〉	통과 (0.01ms, 9.94MB)
테스트 10 〉	통과 (0.01ms, 10.1MB)
테스트 11 〉	통과 (0.01ms, 10.1MB)
테스트 12 〉	통과 (0.01ms, 9.95MB)
테스트 13 〉	통과 (0.01ms, 10.1MB)
테스트 14 〉	통과 (56.07ms, 10.3MB)
테스트 15 〉	통과 (88.34ms, 10.2MB)
테스트 16 〉	통과 (145.86ms, 10.2MB)
테스트 17 〉	통과 (212.07ms, 10.3MB)
테스트 18 〉	통과 (268.86ms, 10.3MB)
테스트 19 〉	통과 (299.22ms, 10.3MB)
테스트 20 〉	통과 (473.25ms, 10.2MB)

효율성  테스트
테스트 1 〉	통과 (1.09ms, 10.9MB)
테스트 2 〉	통과 (1.07ms, 10.9MB)
테스트 3 〉	실패 (시간 초과)
테스트 4 〉	실패 (시간 초과)

채점 결과
정확성: 83.3
효율성: 8.3
합계: 91.7 / 100.0
'''


def solution(phone_book):
    answer = True
    len_sort = sorted(phone_book,key=len)
    
    while(answer):
        adj = len_sort.pop(0)
        if len(len_sort) == 0 : break
        
        for phone in len_sort:
            if phone.startswith(adj) : 
                answer = False
        
    return answer



'''
# 해시 정석
def solution(phone_book): 

    # 1.Hash map생성
    hash_map = {} 
    for nums in phone_book: 
        hash_map[nums] = 1 
    
    # 2.접두어가 Hash map에 존재하는지 찾기 
    for nums in phone_book: 
        arr = "" 
        for num in nums: 
            arr += num
    
            # 3. 본인 자체일 경우는 제외
            if arr in hash_map and arr != nums:       
                return False 
                
    return True
'''
