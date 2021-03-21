package com.demo.array;

public class SeekColumnIndex {

    public static void main(String[] args) {
        String [] arr = new String[10000];
        for (int i=0;i<arr.length;i++) {
            arr[i] = "COL"+i;
        }

        int indexValue = getIndex(arr,"COL999");

        System.out.println("索引的值为" + indexValue);
    }

    /**
     * 返回数组的索引
     * @param str
     * @return
     */
    private static int getIndex(String [] arr,String str) {
        for (int i=0;i<arr.length;i++) {
            if (arr[i].equalsIgnoreCase(str)) {
                return i;
            }
        }
        // 如果没有获取到索引就返回-1
        return -1;
    }
}