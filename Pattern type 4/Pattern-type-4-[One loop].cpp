#include<iostream>
using namespace std;

int main(){

	int n = 5;
	int times = 4;
	int i = 1;
	int toggle = 0;
	string p = "  ";
	
	int count = 1;
	
	int j;
	
	l1: while(i <= times){
		cout << p;
		i++;
	}
	
	count++;
	
	if(count <= n+n){
		if(p == "  "){
			toggle = 1;
		} else {
			toggle = 0;
			cout << endl;
		}
		
		if(toggle == 1){
			j = times;
			p = "* ";
			times = n;
			goto l1;
		} else {
			j--;
			times = j;
			i = 1;
			p = "  ";
			goto l1;
		}	
	}
	
	return 0;
}
