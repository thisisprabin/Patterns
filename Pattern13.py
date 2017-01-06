'''
A  
B  B  
C  C  C  
D  D  D  D  
E  E  E  E  E 
'''

import threading
import time

class Pattern13:
    def run(self):
        for i in range(65, 70):
            for j in range(64, i):
                print(chr(i)," ", end="")
                time.sleep(1);
            print()    


def Main():
    obj = Pattern13();
    th = threading.Thread(target=obj.run());
    th.start()
    
if __name__ == "__main__":
    Main()
                