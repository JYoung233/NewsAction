package com.yangyang.newsaction;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

/**
 * Created by yangyang on 2016/3/18.
 * Socket 练习
 */
public class SocketClient {

//    public static void main(String[] args){
//        SocketClient client=new SocketClient();
//        client.start();
//
//    }在activity中调用
   //允许用户从命令行输入信息
    public void start(String content) {
        BufferedReader reader=null;//从服务器端socket中读取数据
        BufferedWriter writer=null;//将EditView中字符串写进Socket 传给服务器端
        Socket socket=null;

        try {
            socket=new Socket("localhost",9898);//域名和端口号
            reader=new BufferedReader(new InputStreamReader(socket.getInputStream()));
            writer=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

           if(content!=null){
                System.out.println(content);
                writer.write(content + "\n");//因为服务器端读取的时候是按行读入的
                writer.flush();
                String response=reader.readLine();
                System.out.println(response);
            }
            //捕获全局异常
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            try {

                reader.close();
                writer.close();
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

}
