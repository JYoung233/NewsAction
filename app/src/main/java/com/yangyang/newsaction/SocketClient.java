package com.yangyang.newsaction;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by yangyang on 2016/3/18.
 * Socket 练习
 */
public class SocketClient {

    public static void main(String[] args){
        SocketClient client=new SocketClient();
        client.start();

    }
   //允许用户从命令行输入信息
    private void start() {
        BufferedReader inputreader;
        inputreader= new BufferedReader(new InputStreamReader(System.in));
        String content;
        try {
            while(!(content=inputreader.readLine()).equals("bye")){
                System.out.println(content);
            }
            //捕获全局异常
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
