n = int(input())
for _ in range(n):
    phone = input()
    if ' ' in phone:
        country, area, number = phone.split()
    elif '-' in phone:
        country, area, number = phone.split('-')
    print("CountryCode=" + country + ",LocalAreaCode=" + area + ",Number=" + number)