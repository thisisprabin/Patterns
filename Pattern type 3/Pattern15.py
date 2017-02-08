'''
 *  *  *  *  * 
 *  *  *  * 
 *  *  * 
 *  * 
 * 
'''

import threading
import time

class Pattern15:
    def run(self):
        i = 5;
        while(i>0):
            j = 0;
            while(j<i):
                print(" * ", end="");
                time.sleep(1)
                j+=1;
            print();
            i-=1;    


def Main():
    obj = Pattern15();
    th = threading.Thread(target=obj.run());
    th.start();                
    
    
if __name__ == "__main__":
    Main();    
            