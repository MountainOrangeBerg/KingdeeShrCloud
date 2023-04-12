package com.mountain.code;

import java.util.HashMap;

/**
 * 滑动窗口
 */
public class SlidingWindow {

    public static void main(String[] args) {
        int max = lengthOfLongestSubstring("abcdab");

//        StringBuffer sql = new StringBuffer();
//        sql.append("/*dialect*/ ");
//        sql.append("SELECT a.Fnumber,a.fid personId,a.FName_l2 personName,b.FENTERDATE,b.FHRORGUNITID HRORGUNITID, c.FPRIMARYPOSITIONID POSITIONID ,c.FPERSONDEP PERSONDEPID FROM t_bd_person a left join T_HR_EMPLABORRELATION b on a.FID = b.FPERSONID left join T_HR_PERSONPOSITION c on a.FID = c.FPERSONID   ");
//
//        sql.append("  where to_char( b.FENTERDATE  ,'mm-dd') =  to_char(sysdate -1,'mm-dd') and to_char( b.FENTERDATE  ,'yyyy') <> to_char(sysdate,'yyyy')  ");
//
//        System.out.println(sql);
        System.out.println(max);
    }


    public static int lengthOfLongestSubstring(String s) {
        //传入参数
        if (s.length() == 0) return 0;
        //map集合记录获取到的参数
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        //记录不重复的元素最长个数
        int max = 0;
        int left = 0;
        //for循环遍历整个字符串
        for (int i = 0; i < s.length(); i++) {
//            判断当前遍历的字符串是否重复出现？
            if (map.containsKey(s.charAt(i))) {
                //当前指针元素重复出现了，取之前的长度和现在出现重复元素的位置的长度判断，取大的
                left = Math.max(left, map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i), i);
            max = Math.max(max, i - left + 1);
        }
        return max;

    }


}
