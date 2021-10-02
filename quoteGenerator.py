from quote import quote
from random_word import RandomWords
r=RandomWords()
w=r.get_random_word()
print("Word Generated: "+w)
res = quote(w,limit=1)
print(res[0]['quote'])
res=[]