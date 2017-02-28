#include<iostream>
using namespace std;

int main(){
	
	int num = 1;
	int i=1;
	
	l1:while(i<=num){
		cout << "* ";
		i++;
	}
	
	cout << endl;
	
	if(num < 5){
		num++;
		i=1;
		goto l1;
	}
	
	return 0;
}
