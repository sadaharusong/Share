package com.example.share;

import cn.sharesdk.onekeyshare.OnekeyShare;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity
{
	Button share_sina_but;
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		share_sina_but = (Button) findViewById(R.id.button_share_sina);
		share_sina_but.setOnClickListener(new OnClickListener()
		{
			
			@Override
			public void onClick(View v)
			{
				// TODO Auto-generated method stub
				OnekeyShare onekeyShare = new OnekeyShare();
				//设置标题
				onekeyShare.setTitle("分享一下");
				//设置编辑内容
				onekeyShare.setText("嘿嘿嘿。 分享给你们  我是老司机");
				//设置图标
//				onekeyShare.setImagePath("");
				//启动
				onekeyShare.show(MainActivity.this);
			}
		});
	}

	
}
