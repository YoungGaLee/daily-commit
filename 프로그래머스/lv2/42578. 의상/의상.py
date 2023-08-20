
def solution(clothes):
    answer = 1
    diclothes = {}
    for name, typ in clothes:
        if typ in diclothes.keys():
            diclothes[typ] += 1
        else:
            diclothes[typ] = 1
    for num in diclothes.values():
        print(num)
        answer *= (num+1) 
    return answer-1