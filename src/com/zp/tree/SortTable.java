package com.zp.tree;


public class SortTable {
    /**
     * 顺序表算法实现
     */
   /* int SearchSqTable(SqTable T,KeyType key){
        *//*再顺序表T中，从后往前查找键值等于key的数据元素，若找到，则返回该元素再T中的位置，否则返回0，标记查找不成功*//*
        T.elem[0].key=key;//设置岗哨
        i=T.n;          //设置比较位置初始值
        while(T.elem[i].key!=key){
            i--;        //未找到时，修改比较位置继续查找
        }
        return i;
    }*/

//    /**
//     * 折半查找
//     */
//    int SearchBin(SqTable T,KeyType key){
//        /*在有序表T中，用二分查找法查找键值等于key的元素，变量low，high分别标记查找区间下界和上界*/
//        int low,high;
//        low=1;high=T.n;     //置查找区间初
//        while(low<=high){
//                                            //区间长度不为0时继续擦轰炸
//            mid(low+high)/2;                    //对区间进行折半，"/"为整除
//            if(key==T.elem[mid].key)return mid;
//            else if(key<T.elem[mid].key)high=mid-1;        //在前半区间查找
//            else low=mid+1;                                 //在后半区间查找
//        }
//        return 0;                       //查找不成功，则返回0
//    }
}
