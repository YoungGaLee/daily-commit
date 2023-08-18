'''
# 효율성 통과하는 법 : pop() 하는 부분을 없애고 인덱스로 조회
for문을 통해 이미 O(n)
pop(0)의 경우 복잡도 O(n)
+ deque 에서는 startswith 사용불가

del 도 O(n)이네..
시간복잡도는 리스트에서 가장 크다
https://wayhome25.github.io/python/2017/06/14/time-complexity/
https://chancoding.tistory.com/43
'''

'''
정확성  테스트
테스트 1 〉	통과 (0.01ms, 10MB)
테스트 2 〉	통과 (0.01ms, 10.3MB)
테스트 3 〉	통과 (0.01ms, 10MB)
테스트 4 〉	통과 (0.01ms, 10.1MB)
테스트 5 〉	통과 (0.01ms, 10.2MB)
테스트 6 〉	통과 (0.01ms, 10.2MB)
테스트 7 〉	통과 (0.01ms, 10.2MB)
테스트 8 〉	통과 (0.00ms, 10.1MB)
테스트 9 〉	통과 (0.01ms, 10.1MB)
테스트 10 〉	통과 (0.01ms, 10.2MB)
테스트 11 〉	통과 (0.00ms, 10.2MB)
테스트 12 〉	통과 (0.00ms, 10.1MB)
테스트 13 〉	통과 (0.00ms, 10.1MB)
테스트 14 〉	통과 (0.33ms, 10.1MB)
테스트 15 〉	통과 (0.46ms, 10.2MB)
테스트 16 〉	통과 (0.78ms, 10.3MB)
테스트 17 〉	통과 (1.00ms, 10.2MB)
테스트 18 〉	통과 (0.83ms, 10.2MB)
테스트 19 〉	통과 (0.90ms, 10.3MB)
테스트 20 〉	통과 (1.60ms, 10.5MB)

효율성  테스트
테스트 1 〉	통과 (2.93ms, 10.8MB)
테스트 2 〉	통과 (2.76ms, 10.7MB)
테스트 3 〉	통과 (85.26ms, 30.6MB)
테스트 4 〉	통과 (87.86ms, 28MB)

채점 결과
정확성: 83.3
효율성: 16.7
합계: 100.0 / 100.0
'''

def solution(phone_book):
    phone_book.sort()
    for p1, p2 in zip(phone_book, phone_book[1:]):
        if p2.startswith(p1):
            return False
    return True


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
