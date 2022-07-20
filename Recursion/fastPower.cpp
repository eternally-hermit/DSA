#include<iostream>
using namespace std;

int fastPower(int a,int n){

    // Base Case
    if(n == 0) {
        return 1;
    }

    int subPower = fastPower(a,n/2);
    int sq_pow = subPower*subPower;
    if(n&1){
        return a*sq_pow;
    }
    return sq_pow;
}

int main(){

    cout<<fastPower(3,6);
    return 0;
}