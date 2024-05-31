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
