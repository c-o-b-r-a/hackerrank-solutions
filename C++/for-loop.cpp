/* LINK - https://www.hackerrank.com/challenges/c-tutorial-for-loop/problem?isFullScreen=true */

#include <iostream>
#include <bits/stdc++.h>
using namespace std;

string getNumber(int number){
    switch(number){
        case 1:
            return "one";
        case 2:
            return "two";
        case 3:
            return "three";
        case 4:
            return "four";
        case 5:
            return "five";
        case 6:
            return "six";
        case 7:
            return "seven";
        case 8:
            return "eight";
        case 9:
            return "nine";
        default:
            if (number%2) return "odd";
            else return "even";
    }
}

int main() {
    int firstNumber, lastNumber;
    cin >> firstNumber >> lastNumber;
    for(int i=firstNumber; i<=lastNumber; i++){
        cout << getNumber(i) << "\n";
    }
    return 0;
}