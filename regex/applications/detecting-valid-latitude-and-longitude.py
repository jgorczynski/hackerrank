import re

SIGN = '[\+-]?'
DECIMALS = '(\.[0-9]+)?'
ZEROS = '(\.0+)?'

LATITUDE =  f'{SIGN}(90{ZEROS}|[1-8]\d{DECIMALS}|\d{DECIMALS})'
LONGITUDE = f'{SIGN}(180{ZEROS}|1[0-7]\d{DECIMALS}|[1-9]\d{DECIMALS}|\d{DECIMALS})'

REGEX = f'\({LATITUDE}, {LONGITUDE}\)'
pattern = re.compile(REGEX)

def validate(value):
    return pattern.search(value)

for _ in range(int(input())):
    if validate(input()):
        print('Valid')
    else:
        print('Invalid')