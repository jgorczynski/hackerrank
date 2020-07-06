import re

for i in range(int(input())):print("YES") if bool(re.match(r'^[A-Z]{5}\d{4}[A-Z]$',input())) else print("NO")