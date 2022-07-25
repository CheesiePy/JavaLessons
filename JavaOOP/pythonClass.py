class Board:
    
    def __init__(self, size):
        self.size = size

    
    def Jelly(self, a, b):
        for i in range(b):
            print(chr(a+i))    



# print(b.size, c.size)



# Object 
mystr = "python is easy and fun!"



# mylist = ["may", 29, mystr, b, c]
# print(mystr[0])

c = "A"
print(ord(c))


 # ASCII code
# y = x + 1
# print(chr(y))




def Jelly(a, b):
        lst = []
        for i in range(b):
            lst.append(chr(a+i)) 
             
        return lst






def main():

    b1 = Board(10)
    c = Board(20)

    for i in range(20):
    
    print(Jelly(65, 26)[0])
    print("---🤔---")

main()    