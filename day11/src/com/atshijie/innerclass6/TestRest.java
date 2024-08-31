package com.atshijie.innerclass6;

public class TestRest {
    public static void main(String[] args) {
        Rest[] r = new Rest[3];
        r[0] = new Rest(){
            public void rest(){
                System.out.println("休息就是睡大觉");
            }
        };
        r[1] = new Rest(){
            public void rest(){
                System.out.println("休息就是到处浪");
            }
        };
        r[2] = new Rest(){
            public void rest(){
                System.out.println("休息就是偷偷学习");
            }
        };

        for (int i = 0; i < r.length; i++) {
            r[i].rest();
        }
    }
}
