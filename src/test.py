# test.py 
import sys
sys.path.append("/home")
print(sys.path)


from example_package_kyoofus.example import add_one 
print(add_one(1))


import requests

response = requests.get('https://httpbin.org/ip')
print('Your IP is {0}'.format(response.json()['origin']))