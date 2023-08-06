# 완전탐색 > 순열

from itertools import permutations 
def recursive(k, case):
    count = 0
    for need, spend in case:
        if need > k:
            break
        k-=spend
        count+=1
        
    return count


def solution(k, dungeons):
    answer = 0
    for case in permutations(dungeons):
        count = recursive(k, case)
        if answer < count:
            answer = count
    return answer


'''
테스트 1 〉	통과 (0.01ms, 10.2MB)
테스트 2 〉	통과 (0.02ms, 10MB)
테스트 3 〉	통과 (0.09ms, 10.3MB)
테스트 4 〉	통과 (0.07ms, 10MB)
테스트 5 〉	통과 (0.62ms, 10.2MB)
테스트 6 〉	통과 (2.81ms, 10.2MB)
테스트 7 〉	통과 (36.39ms, 10.3MB)
테스트 8 〉	통과 (28.28ms, 10.2MB)
테스트 9 〉	통과 (0.05ms, 10.2MB)
테스트 10 〉	통과 (2.63ms, 10.2MB)
테스트 11 〉	통과 (0.01ms, 10.2MB)
테스트 12 〉	통과 (17.05ms, 10.2MB)
테스트 13 〉	통과 (12.62ms, 10.1MB)
테스트 14 〉	통과 (11.76ms, 10.2MB)
테스트 15 〉	통과 (11.44ms, 10.3MB)
테스트 16 〉	통과 (1.41ms, 10.3MB)
테스트 17 〉	통과 (12.63ms, 10.1MB)
테스트 18 〉	통과 (0.01ms, 10.3MB)
테스트 19 〉	통과 (0.05ms, 10.2MB)

채점 결과
정확성: 100.0
합계: 100.0 / 100.0
'''
