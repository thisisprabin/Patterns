'''
* 
* * 
* * * 
* * * * 
* * * * * 
'''

import threading;
import time;

class Pattern10:
    def run(self):
        for i in range(6):
            for j in range(i):
                print ("* ", end="");
                time.sleep(1);
            print();
 

def Main():
    obj = Pattern10();
    th = threading.Thread(target=obj.run());
    th.start();


if __name__ == "__main__":
    Main()