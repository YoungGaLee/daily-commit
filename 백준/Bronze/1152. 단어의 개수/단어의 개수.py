'''
split()과 split(' ')은 다르다.

split( )은 공백이 1개이건 2개이건 n개이건 상관없이 무조건 1개로 보고 처리 \t \n
split(" ")은 공백 1개, 1개를 각각의 공백으로 따로따로 처리
'''

words = input().split()
print(len(words))
