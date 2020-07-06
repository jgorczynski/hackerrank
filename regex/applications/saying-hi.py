import re

pattern = re.compile(r'^[Hh][Ii]\s[^Dd]\w*')

n = int(input())
for _ in range(n):
    sentence = input()
    if pattern.match(sentence):
        print(sentence)