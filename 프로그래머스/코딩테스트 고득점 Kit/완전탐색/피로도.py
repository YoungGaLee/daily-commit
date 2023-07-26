23.07.27  1차시도 - fail

"""
순서대로X 뭔가 정렬을 해야겠다.
최소 필요 피로도순? / 소모 피로도순?
예시가 힌트일까
예시 : 1-3-2 /// 최소 - 소모 순?
모든 케이스에서 참이라는 생각은 안들지만 일단 해보자.
(던전개수도 최대 8이니 ㄱㄱ)
어우 너무 계산량 많아지는데.. 이렇게 푸는 문제 맞나..

다시보니 저 answer--는 어떤 힌트일까
-1이 되면 멈춰라? 재귀사용?
"""



def solution(k, dungeons):
    diffList = []
    diffList_ = []
    for case in dungeons :
        diff = case[0] - case[1]
        diffList.append(diff)
    for order in enumerate(diffList):
        diffList_.append(order)
    ans = sorted(diffList_, key=lambda x : x[1])
    count = 0
    for num, trash in diffList_:
        tr, mi = dungeons[num]
        k-=mi
        if k <0:
            break
        count+=1
        
    return count
