'''
A  
A  B  
A  B  C  
A  B  C  D  
A  B  C  D  E  
'''

import threading
import time

class Pattern14:
    def run(self):
        for i in range(65, 70):
            for j in range(65, i+1):
                print(chr(j)," ", end="");
                time.sleep(1);
            print()

def Main():
    obj = Pattern14();
    th = threading.Thread(target=obj.run());
    th.start();

if __name__ == "__main__":
    Main();                    
            