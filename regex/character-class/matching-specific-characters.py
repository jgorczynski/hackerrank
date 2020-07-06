Regex_Pattern = r'^[0123xsAau.,]{6}$'	# Do not delete 'r'.

import re

print(str(bool(re.search(Regex_Pattern, input()))).lower())