#include <iostream>

using namespace std;

long pow(int a, int b)
{
    if(b == 0){
        return 1;
    }
    if(b == 1){
        return a;
    }
    if(b%2 == 0){
        return pow(a*a, int(b/2));
    }
    else{
        return pow(a*a, int(b/2))*a;
    }

}


int main()
{
    long sonuc = pow(3,10);
    cout << sonuc;
    return 0;
}
