package com.ip.programs;

public class SecondLargest {
    public int findLargest(int arr[]) {

        int a1=0;
        int a2=0;
        for(int i=0;i<arr.length;i++){
            if(a1<arr[i]){
                a2=a1;
                a2=arr[i];
            } else if(a2<arr[i]){
                a2=arr[i];
            }
        }

        return a2;
    }
}
