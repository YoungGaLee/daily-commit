'''
1. zip으로 묶어야겠다. 아니면 Counter로 정리
2. 장르별로 재생횟수를 sum , 따로 각곡별 정리 
>>이걸 다 정리하려면 zip으로 일단 dic만드는게 맞을 듯
'''

def solution(genres, plays):
    index = {play:i for i, play in enumerate(plays)}
        
    d = list(zip(genres, plays))
    
    dic = {}
    for k, v in zip(genres, plays):
        if k in dic.keys():
            dic[k].append(v)
        else:
            dic[k] = [v]
    dic_sum= {genre : total for genre, total in zip(dic.keys(),list(map(sum,dic.values())))}
    sort_genre = dict(sorted(dic_sum.items(), key=lambda x: x[1], reverse=True))
    # print(dic)
    # print(sort_genre)
    ans = []
    for song in sort_genre.keys():
        
        # print(song)
        song_list = dic[song]
        # print(song_list)
        song_list.sort(reverse=True)
        # print(song_list)
        try:
            for play in song_list[:2]:
                ans.append(index[play])
        except:
            pass
    return ans
