'''
1  
2  2  
3  3  3  
4  4  4  4  
5  5  5  5  5  
'''

import threading;
import time;

class Pattern11:
    def run(self):
        for i in range(6):
            for j in range(i):
                print(i," ", end="");
                time.sleep(1);
            print();


def Main():
    obj = Pattern11();
    th = threading.Thread(target=obj.run());
    th.start();
    

if __name__ == "__main__":
    Main();    
    
                    