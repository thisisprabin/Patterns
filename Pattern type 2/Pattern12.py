'''
1  
1  2  
1  2  3  
1  2  3  4  
1  2  3  4  5 
'''

import threading
import time

class Pattern12:
    def run(self):
        for i in range(6):
            for j in range(1, i+1):
                print(j," ", end="");
                time.sleep(1);
            print();

def Main():
    obj = Pattern12();
    th = threading.Thread(target=obj.run());
    th.start();

if __name__ == "__main__":
    Main();                    