def solution(clothes):
    answer = 1
    diclothes = {}
    for name, typ in clothes:
        if typ in diclothes.keys(): diclothes[typ] += 1
        else: diclothes[typ] = 1
    for num in diclothes.values():
        answer *= (num+1) 
    return answer-1

'''
실행 결과
채점을 시작합니다.
정확성  테스트
테스트 1 〉	통과 (0.01ms, 10.2MB)
테스트 2 〉	통과 (0.01ms, 10.3MB)
테스트 3 〉	통과 (0.01ms, 10.2MB)
테스트 4 〉	통과 (0.02ms, 10.1MB)
테스트 5 〉	통과 (0.01ms, 10.2MB)
테스트 6 〉	통과 (0.01ms, 10.3MB)
테스트 7 〉	통과 (0.02ms, 10.1MB)
테스트 8 〉	통과 (0.01ms, 10MB)
테스트 9 〉	통과 (0.01ms, 10.2MB)
테스트 10 〉	통과 (0.00ms, 10.3MB)
테스트 11 〉	통과 (0.01ms, 10.1MB)
테스트 12 〉	통과 (0.02ms, 10MB)
테스트 13 〉	통과 (0.02ms, 10.2MB)
테스트 14 〉	통과 (0.01ms, 10MB)
테스트 15 〉	통과 (0.00ms, 10.1MB)
테스트 16 〉	통과 (0.01ms, 10.1MB)
테스트 17 〉	통과 (0.01ms, 10.2MB)
테스트 18 〉	통과 (0.01ms, 10.3MB)
테스트 19 〉	통과 (0.01ms, 10MB)
테스트 20 〉	통과 (0.01ms, 10.2MB)
테스트 21 〉	통과 (0.01ms, 10MB)
테스트 22 〉	통과 (0.01ms, 10.1MB)
테스트 23 〉	통과 (0.01ms, 10.1MB)
테스트 24 〉	통과 (0.01ms, 10.1MB)
테스트 25 〉	통과 (0.01ms, 10.1MB)
테스트 26 〉	통과 (0.02ms, 10.3MB)
테스트 27 〉	통과 (0.01ms, 10.2MB)
테스트 28 〉	통과 (0.02ms, 10.1MB)
채점 결과
정확성: 100.0
합계: 100.0 / 100.0
'''

'''
# 시간복잡도 고려x, 사실 이렇게 하고 싶었음.
def solution(clothes):
    answer = 1
    dic = {}
    chunk = [list(x) for x in zip(*clothes)]

    for key in set(chunk[1]): dic[key] = 0
    for cloth in chunk[1]: dic[cloth] +=1
    for num in dic.values() : answer *= (num+1)    
    
    return answer-1
'''
