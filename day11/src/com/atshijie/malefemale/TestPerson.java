package com.atshijie.malefemale;
//（4）周末一群男男女女相亲，在测试类`TestPeople`创建不同对象放在Person[]数组中，
//
//        - 遍历数组，自我介绍，
//        - 再次遍历数组，调用吃饭方法
//        - 吃完饭，最后遍历数组，都去上厕所，男的上完厕所抽烟，女的上完厕所补妆。
public class TestPerson {
    public static void main(String[] args) {
        Person[] arr = new Person[4];
        arr[0] = new Man("张三",23,"Java中级工程师");
        arr[1] = new Man("李四",24,"大数据工程师");
        arr[2] = new Woman("翠花",22,"UI设计师");
        arr[3] = new Woman("如花",23,"前端设计师");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i].eat();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] instanceof Man){
                arr[i].toilet();
                ((Man)arr[i]).smoke();
            }
            if (arr[i] instanceof Woman){
                arr[i].toilet();
                ((Woman)arr[i]).makeup();
            }
        }

    }


}
