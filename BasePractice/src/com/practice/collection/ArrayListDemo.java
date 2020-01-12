package com.practice.collection;
import com.practice.base.ReverseInput;

import java.util.*;

/**
 * @ClassName ArrayListDemo
 * @Author wanghui
 * @Description TODO
 * @Date 2020/1/6 11:28 上午
 **/
public class ArrayListDemo {
    public static void arrayListDemo1(){
        ArrayList<Integer> l = new ArrayList<Integer>();
        System.out.println("请输入数字：\n");
        for(int i=0;i<3;i++){
            String s = ReverseInput.inputStr("");
            int input = Integer.parseInt(s);
            l.add(input);
        }
        for (Object o : l) {
            System.out.print(o + " ");
        }
        // 从小到大顺序输出
        Collections.sort(l);
        System.out.println(l);

        // 从大到小顺序输出
//        Collections.sort(l,Collections.reverseOrder());
        l.sort(Collections.reverseOrder());
        System.out.println(l);

        // 随机输出
        // 第一种
        Collections.shuffle(l);
        System.out.println(l);
        // 第二种
        ArrayList<Integer> randomList = new ArrayList<>(l.size());
        do{
            int randomIndex = Math.abs(new Random().nextInt(l.size()));
            randomList.add((Integer) l.remove(randomIndex));
        }while(l.size() > 0);
        System.out.println(randomList);
    }

    public static void arrayListDemo2(){
        ArrayList<String> al = new ArrayList<>();
        ArrayList<String> al1 = new ArrayList<>();
        al.add("小编");
        al.add("小王");
        al.add("小张");
        al1.add("95分");
        al1.add("94分");
        al1.set(1,"95分");
        Iterator<String> i = al.iterator();
        Iterator<String> i1 = al1.iterator();
        while (i.hasNext() && i1.hasNext()){
            System.out.println(i.next() + ":"+i1.next());
        }
    }

    public static void hashMapdemo2(){
        HashMap<String, String> hm = new HashMap<String, String>();
        hm.put("key","username");
        hm.put("value","password");
        String username = ReverseInput.inputStr("请输入用户名：\n");
        String password = ReverseInput.inputStr("请输入密码：\n");
        String key = hm.get("key").toString();
        String value = hm.get("value").toString();
        // 判断字符串是否相等应该用equals方法
        if(key.equals(username) && value.equals(password)){
            System.out.println("账号密码正确");
        }else{
            System.out.println("账号密码错误");
        }
    }

    public static void listDemo(){
        ArrayList<Integer> al1 = new ArrayList<>();
        al1.add(2);
        al1.add(1);
        al1.add(4);
        al1.add(6);
        ArrayList<Integer> al2 = new ArrayList<>();
        al2.add(4);
        al2.add(15);
        al2.add(5);
        al2.add(25);
        al2.add(35);
        ArrayList<Integer> al3 = new ArrayList<Integer>();
        al3 = (ArrayList<Integer>) al1.clone();
        al3.removeAll(al2);
        System.out.println(al1);
        al3.addAll(al2);
        System.out.println(al3);

    }

    public static void listToMap(){
        ArrayList<Integer> al1 = new ArrayList<>();
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0;i<20;i++){
            al1.add(i);
        }
        System.out.println(al1);
        int n = 20;
        for(int i=0;i<n/2;i++){
            hm.put(al1.get(i),al1.get(n-i-1));
            System.out.println("key:"+i+" value: "+ hm.get(i));
        }
        System.out.println(hm);

    }

    public static void mapDemo(){
        String s = ReverseInput.inputStr("请输入1-20之间的数字：\n");
        int input = Integer.parseInt(s);
        HashMap<Integer, Integer> hm = new HashMap<>();
        int n = 20;
        for(int i=0; i<n/2;i++){
            hm.put(i+1, i+n/2);
        }
        System.out.println(hm);
        int output;
        if(hm.containsKey(input)){
            output = hm.get(input);
            System.out.println(output);
        }else if (hm.containsValue(input)){
            for(Integer key: hm.keySet()){
                int k = key;
                if(hm.get(k) == input){
                    output = k;
                    System.out.println(output);
                }
            }
        }


    }

    public static void main(String[] args){

        arrayListDemo1();
//        arrayListDemo2();
//        hashMapdemo2();
//        listDemo();
//        listToMap();
//        mapDemo();
    }
}
