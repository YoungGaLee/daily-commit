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
    len_sort = sorted(phone_book,key=len)

    answer = True
    for i, adj in enumerate(len_sort):
        count = 0 
        for number in len_sort[i:]:
            if number.startswith(adj) == True: 
                count += 1
                if count == 2:
                    answer = False
                    break
        if count == 2:
            break
                
    return answer
  
