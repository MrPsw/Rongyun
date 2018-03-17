package com.example.psw.androidtest;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import java.util.HashMap;

import io.rong.imkit.RongIM;
import io.rong.imlib.RongIMClient;
import io.rong.imlib.model.Conversation;

public class MainActivity extends FragmentActivity {


    private static String token1="ZCyOJwniT1Fsuy/yx/qf4EKcvulwnpJv7oy3KpUmsdEjjvlyrmllMonux1YkDEYlKLRLRDz2q+eR0D1rr0uqtQ==";

    private static String token2="jgdRkMZ1PR0hrT7TAsqWJqefx9fJJT9Drdez/2aqg52z1mg8Dd1WoIXwTxbnxk0EObn5zvSRe2R9mV4EnfksxA==";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.bt1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //用户连接 
                connect(token1,"10086");
            }
        });

        findViewById(R.id.bt2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                connect(token2,"10010");
            }
        });

    }
    private void connect(String token, final String userId){
        RongIM.connect(token, new RongIMClient.ConnectCallback() {
            @Override
            public void onTokenIncorrect() {

            }

            @Override
            public void onSuccess(String s) {
                Log.e("连接情况","内容："+s);
                Toast.makeText(MainActivity.this,"登录成功",Toast.LENGTH_LONG).show();

                /**
                 * 启动单聊界面。
                 *
                 * @param context      应用上下文。
                 * @param targetUserId 要与之聊天的用户 Id。
                 * @param title        聊天的标题，开发者需要在聊天界面通过 intent.getData().getQueryParameter("title")
                 *                     获取该值, 再手动设置为聊天界面的标题。
                 */
//                RongIM.getInstance().startPrivateChat(MainActivity.this, userId, "商户");

                HashMap<String, Boolean> hashMap = new HashMap<>();
                //会话类型 以及是否聚合显示
                hashMap.put(Conversation.ConversationType.PRIVATE.getName(),false);
                hashMap.put(Conversation.ConversationType.PUSH_SERVICE.getName(),true);
                hashMap.put(Conversation.ConversationType.SYSTEM.getName(),true);
                RongIM.getInstance().startConversationList(MainActivity.this,hashMap);
            }

            @Override
            public void onError(RongIMClient.ErrorCode errorCode) {

            }
        });
    }

}
