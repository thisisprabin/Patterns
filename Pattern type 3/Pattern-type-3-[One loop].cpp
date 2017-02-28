#include<iostream>
using namespace std;

int main(){
	
	int num = 5, i = 1;
	
	l1:while(i <= num){
		cout <<"* ";
		i++;
	}
	cout << endl;
	
	if(num > 1){
		num--;
		i=1;
		goto l1;
	}
}
