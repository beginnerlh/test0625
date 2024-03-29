/*
题目描述
一只兔子藏身于20个圆形排列的洞中（洞从1开始编号），一只狼从x号洞开始找,下次隔一个洞找(即在x＋2号洞找)，
在下次个两个洞找(即在x＋5号洞找)，它找了n次仍然没有找到。问兔子可能在那些洞中。
输入描述:
输入有多组数据，每组数据一行两个整数分别为x和n(x <= 20,n <= 100000)
输出描述:
每组数据一行按从小到大的顺序输出兔子可能在的洞，数字之间用空格隔开。若每个洞都不肯能藏着兔子，输出-1。
    */
package lianxi0625;

import java.util.*;

public class Test1{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int[] nums = new int[20];
            int x = in.nextInt();
            int n = in.nextInt();
            int count =0;
            for(int i=0;i<n;i++){
                if(nums[(x-1)%20] == 0){
                    nums[(x-1)%20] = 1;
                    count ++;
                }
                x = x + i + 2;
            }
            if(count == 0){
                System.out.println(-1);

            }else{
                for(int i = 0;i<nums.length;i++){
                    if(nums[i] == 0){
                        System.out.print(i+1+" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
