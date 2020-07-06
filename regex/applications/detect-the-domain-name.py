import re

regex_pattern=r'http(s?)://(?:www.)?(([a-zA-Z0-9_-]+\.)+[a-zA-Z]+)'
l=[]
n=int(input())
for i in range(n):
    s=input()
    if re.search(regex_pattern,s):
        for match in re.findall(regex_pattern,s):            
            l.append(match[1])

print(*sorted(set(l)),sep=';')