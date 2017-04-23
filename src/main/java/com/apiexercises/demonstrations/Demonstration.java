package com.apiexercises.demonstrations;

/**
Method Demonstrations for review purposes that weren't otherwise needed for this application

 - Demonstrate Casting: at least 4 times with different data types

 - Demonstrate Mastery of Flow Control:
    return (at least twice in a single method)
    break (at least once in the same method)
    continue (at least once in the same method)
    in multiple locations throughout a single method

 - Demonstrate the Use of VarArgs
 **/

public class Demonstration {
    private double d1=0, d2=0;
    private byte b1=0, b2=0;
    private int i1=0, i2=0;
    private char c1=0, c2=0;
    private String string1 = "String 1", string2 = "String 2";
    private boolean boo1 = true, boo2 = true;
    private Object object1, object2;


//Method that casts 4 data types
    //uses a try-catch statement to return an error message if unsuccessful
    public int castingTypes(double d1) {
        try {
            //double to int
            i1 = (int) d1;
            //int to byte
            b1 = (byte) i1;
            //byte to char
            c1 = (char) b1;
            return 200;
        } catch (Exception e) {
            return 418;
        }
    }
//Method that demonstrates flow control
    /*an object called demo is passed to this method
    if boo2 is true, it will return i2
    if boo2 is false and i2 is greater than 100 it goes into a loop
    in the loop, if i1 is a factor of i2, i2 will decrement and go back through the loop
        otherwise, if i2 is greater than 1000, it will return i2
        if i2 is less than 1000(but greater than 100) it will break the loop and return i1+i2
    if i2 was less than 100, it will skip the loop and return i1+i2
    */
    public int masterOfFlow(Demonstration demo){
        if (boo2) return i2;
        else if (i2 >=100){
            for (;i2>100;i2--){
                if (i1 % i2 == 0) continue;
                if (i2 >=1000)return i2;
                else break;
            }
        }
        return i1+i2;
    }
//Method that uses VarArgs
    public int varArgsSummation(int ...v){
        int sum = 0;
        for (int i = 0; i < v.length;i++) {
            sum = sum + v[i];
        }
        return sum;
    }
}
