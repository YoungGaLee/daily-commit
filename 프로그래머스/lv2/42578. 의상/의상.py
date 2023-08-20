
def solution(clothes):
    answer = 1
    dic = {}
    chunk = [list(x) for x in zip(*clothes)]

    for key in set(chunk[1]): dic[key] = 0
    for cloth in chunk[1]: dic[cloth] +=1
    for num in dic.values() : answer *= (num+1)    
    
    return answer-1