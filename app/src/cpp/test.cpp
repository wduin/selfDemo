#include "iostream"
#include "cstring"
using namespace std;

class Test
{
public:
    int *arr;
    //👆 类中有一个指针
    int val;

    //👇 下面是拷贝构造方法,如果没有,那么拷贝时,两个对象的指针地址相同
    // Test() {}
    // Test(const Test &other)
    // {
    //     cout << "调用拷贝构造方法" << endl;
    //     arr = new int;
    //     *arr = *other.arr;
    //     val = other.val;
    // }
};
int main(int argc, char const *argv[])
{
    Test test1 = Test();
    test1.arr = new int[1];
    test1.val = 2;

    Test test2 = test1;
    //👆 test2 执行拷贝构造方法

    cout << "test1 指针地址   " << test1.arr << endl;
    cout << "test2 指针地址   " << test2.arr << endl;
    cout << "test1 非指针地址 " << &(test1.val) << endl;
    cout << "test1 非指针地址 " << &(test2.val) << endl;

    return 0;
}