# Tip. set으로 데이터를 저장하면 중복제거할 필요가 없다. 
# 주의: 리스트명.sort() 메소드는 원본 값을 수정하지만 리턴값은 None이다.

def solution(N, number):
    arr_num = [set([int(str(N)*(i+1))]) for i in range(8)]

    for j  in range(1,8) :
        for k in range(j):
            for n in arr_num[k]:
                for m in arr_num[j-k-1]:
                    arr_num[j].add(n + m)
                    arr_num[j].add(n - m)
                    arr_num[j].add(n * m)
                    if m != 0:
                        arr_num[j].add(n // m)

                if number in arr_num[j]:
                    pass
                    return j+1

    return -1

'''
// testcase 2/9 통과. feedback 필요

import copy

def solution(N, number):
    answer = 1
    stop = 1
    total_num = [N]
    in_num = []

    while (stop):
        total_num = []
        
        if (answer>8):
            answer = -1
            break

        in_num.append(int(str(N)*(answer)))
        answer += 1

        for num in in_num:
            out_num = [num + N, num - N, num * N, num / N]

            if number in out_num:
                stop = 0
                break
                
            total_num.extend(out_num) 
            
        in_num = copy.deepcopy(total_num)

    return answer
'''
